/**
 * 
 */
package interpreter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import node.*;

import analysis.DepthFirstAdapter;

/**
 * @author Benjamin Arnold, Felix Hoeborn
 * 
 */
public class ToC extends DepthFirstAdapter {

	private static final String		CONST_ELSE						= "else", CONST_IF = "if",
			CONST_INCLUDE = "#include", CONST_NULL = "NULL", CONST_STRUCT = "struct", CONST_VOID = "void",
			WHILE = "while";

	private String					bodyPath						= "", headerPath = "", moduleName = "";

	private Set<String>				avaibleFunctions				= new HashSet<String>();

	private Set<String>				avaibleStructs					= new HashSet<String>();

	/*
	 * This represents the scope of all currently avaible function-local defined variables
	 */
	private Map<String, Variable>	currentFunctionVariableScope	= new HashMap<String, Variable>();

	/*
	 * This represents the scope of all currently avaible global-local variables variables
	 */
	private Map<String, Variable>	currentGlobalVariableScope		= new HashMap<String, Variable>();

	/*
	 * This represents the scope of all currently avaible struct-local defined variables
	 */
	private Map<String, Variable>	currentStructVariableScope		= new HashMap<String, Variable>();

	private boolean					currentlyInFunction				= false, signatureOnly = false;

	private StructState				currentStruct					= null;

	public StringBuffer				output							= new StringBuffer();

	private InterpreterState		state							= null;

	private List<String>			warnings						= new ArrayList<String>();

	public ToC(String parentPath, String filename) {
		String path = parentPath + System.getProperty("file.separator") + filename;
		headerPath = path + ".h";
		bodyPath = path + ".c";
		moduleName = filename;
	}

	private void addVariableToScope(String currentID, String type, boolean isParam) {
		addVariableToScope(currentID, type, isParam, -1);
	}
	
	private void addVariableToScope(String currentID, String type, boolean isParam, int line) {
		Variable var = new Variable(currentID, type);
		var.setInitialized(isParam);
		if (currentlyInFunction) {
			if (currentFunctionVariableScope.containsKey(currentID))
				throw new SemanticException("In line " + line + ": Variable " + currentID
						+ " in this function already defined!");
			currentFunctionVariableScope.put(currentID, var);
			return;
		}
		if (currentStruct != null) {
			if (currentStructVariableScope.containsKey(currentID))
				throw new SemanticException("In line " + line + ":Variable " + currentID + " in struct "
						+ currentStruct.getStruct().getId().getText() + "already defined!");
			currentStructVariableScope.put(currentID, var);
			return;
		}
		if (currentGlobalVariableScope.containsKey(currentID))
			throw new SemanticException("In line " + line + ":Variable " + currentID + " already globally defined!");
		currentGlobalVariableScope.put(currentID, var);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAAnotherFuncPara(node.AAnotherFuncPara)
	 */
	@Override
	public void caseAAnotherFuncPara(AAnotherFuncPara node) {
		node.getTerm().apply(this);
		output.append(" , ");
		node.getFuncPara().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAAnotherParam(node.AAnotherParam)
	 */
	@Override
	public void caseAAnotherParam(AAnotherParam node) {
		node.getType().apply(this);
		if (!signatureOnly) {
			output.append(' ');
			String currentID = node.getId().getText();
			output.append(currentID);
			addVariableToScope(currentID, extractType(node.getType()), true, node.getId().getLine());
			output.append(", ");
		} else {
			output.append('_');
		}
		node.getParam().apply(this);
	}

	@Override
	public void caseABiggerOperation(ABiggerOperation node) {
		node.getLeft().apply(this);
		output.append(" > ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseABoolTerm(node.ABoolTerm)
	 */
	@Override
	public void caseABoolTerm(ABoolTerm node) {
		TBool value = node.getBool();
		int compiledValue;
		if (value.getText().equals("false")) {
			compiledValue = 0;
		} else {
			compiledValue = 1;
		}
		output.append(compiledValue);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAConsConstructor(node.AConsConstructor)
	 */
	@Override
	public void caseAConsConstructor(AConsConstructor node) {
		if (currentStruct == null)
			throw new SemanticException("No parent struct!");
		currentlyInFunction = true;
		String currentID = currentStruct.getStruct().getId().getText();
		output.append("struct " + currentID + "*");
		output.append("new_");
		signatureOnly = true;
		node.getParam().apply(this);
		signatureOnly = false;
		output.append(currentID);
		output.append('(');
		node.getParam().apply(this);
		output.append(')');
		if (state != InterpreterState.body) {
			output.append(";\n");
			cleanupAfterFunction();
			return;
		}
		output.append("\n{\n");
		// Allocation
		output.append("struct ");
		output.append(currentID);
		output.append("* this = (struct ");
		output.append(currentID);
		output.append("*) malloc(sizeof(struct ");
		output.append(currentID);
		output.append("));\n");
		node.getImpl().apply(this);
		output.append("return this;\n}\n");
		cleanupAfterFunction();
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAConstructorStructBody(node. AConstructorStructBody)
	 */
	@Override
	public void caseAConstructorStructBody(AConstructorStructBody node) {
		node.getConstructor().apply(this);
		node.getStructBody().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADefineImpl(node.ADefineImpl)
	 */
	@Override
	public void caseADefineImpl(ADefineImpl node) {
		node.getDefine().apply(this);
		node.getImpl().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADefineProgram(node.ADefineProgram)
	 */
	@Override
	public void caseADefineProgram(ADefineProgram node) {
		node.getDefine().apply(this);
		node.getProgram().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADefineStructBody(node.ADefineStructBody)
	 */
	@Override
	public void caseADefineStructBody(ADefineStructBody node) {
		if (currentStruct == null)
			throw new SemanticException(
					"No beginning Struct, why should there be a body? There are no bodies hidden here...");
		node.getDefine().apply(this);
		if (!(node.getStructBody() instanceof ADefineStructBody) && state == InterpreterState.head) {
			output.append("};\n");
		}
		node.getStructBody().apply(this);
	}

	@Override
	public void caseADestroyFunc(ADestroyFunc node) {
		String currentID = node.getId().getText();
		Variable currentVar = checkVariable(currentID, AccessType.read, node.getId().getLine());

		output.append("destroy_");
		output.append(currentVar.getType());
		output.append('(');
		output.append(currentID);
		output.append(");\n");
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADivOperation(node.ADivOperation)
	 */
	@Override
	public void caseADivOperation(ADivOperation node) {
		node.getLeft().apply(this);
		output.append(" / ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAEndFuncPara(node.AEndFuncPara)
	 */
	@Override
	public void caseAEndFuncPara(AEndFuncPara node) {
		// do nothing here
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAEndImpl(node.AEndImpl)
	 */
	@Override
	public void caseAEndImpl(AEndImpl node) {
		// Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAEndParam(node.AEndParam)
	 */
	@Override
	public void caseAEndParam(AEndParam node) {
		// do nothing here
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAEndStructBody(node.AEndStructBody)
	 */
	@Override
	public void caseAEndStructBody(AEndStructBody node) {
		if (currentStruct == null)
			throw new SemanticException("No Struct to end here!");

		String currentID = currentStruct.getStruct().getId().getText();

		/*
		 * No constructor defined and where in body-run, so we generate a empty constructor
		 */
		if (!currentStruct.isConstrCreated()) {
			output.append("struct ");
			output.append(currentID);
			output.append("* new_");
			output.append(currentID);
			output.append("()");
			if (state == InterpreterState.body) {
				// Allocation
				output.append("\n{\nstruct ");
				output.append(currentID);
				output.append("* this = (struct ");
				output.append(currentID);
				output.append("*) malloc(sizeof(struct ");
				output.append(currentID);
				output.append("));\nreturn this;\n}\n");
			} else {
				output.append(";\n");
			}
		}
		output.append(CONST_VOID);
		output.append(" destroy_");
		output.append(currentID);
		output.append("(struct ");
		output.append(currentID);
		output.append("* this)");
		if (state == InterpreterState.body) {
			output.append("{\nfree(this);\n}\n");
		} else {
			output.append(";\n");
		}
		output.append("// END STRUCT ");
		output.append(currentID);
		output.append("\n\n\n");

		cleanupAfterStruct();
	}

	@Override
	public void caseAEofProgram(AEofProgram node) {
		cleanupAfterGlobal();
		try {
			writeOut();
		} catch (IOException e) {
			throw new RuntimeException("Unable to write file. Current state: " + state);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAExprImpl(node.AExprImpl)
	 */
	@Override
	public void caseAExprImpl(AExprImpl node) {
		node.getExpr().apply(this);
		node.getImpl().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAExprTerm(node.AExprTerm)
	 */
	@Override
	public void caseAExprTerm(AExprTerm node) {
		output.append('(');
		node.getExpr().apply(this);
		output.append(')');
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFuncExpr(node.AFuncExpr)
	 */
	@Override
	public void caseAFuncExpr(AFuncExpr node) {
		node.getFunc().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFuncFunc(node.AFuncFunc)
	 */
	@Override
	public void caseAFuncFunc(AFuncFunc node) {
		String currentID = node.getId().getText();
		checkIfFunctionExists(currentID, node.getCall().getLine());
		output.append(currentID);
		output.append('(');
		node.getFuncPara().apply(this);
		output.append(")");
		if ((node.parent().parent() instanceof AExprImpl)) {
			output.append(";\n");
		}
	}

	private void checkIfFunctionExists(String currentID, int line) {
		if (!avaibleFunctions.contains(currentID)) {
			throw new SemanticException("In line " + line + ": Function " + currentID + " not defined.");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFunctionFunction(node.AFunctionFunction)
	 */
	@Override
	public void caseAFunctionFunction(AFunctionFunction node) {
		String currentID = node.getId().getText();
		this.avaibleFunctions.add(currentID);
		currentlyInFunction = true;
		node.getType().apply(this);
		output.append(' ');
		output.append(currentID);
		output.append('(');
		node.getParam().apply(this);
		output.append(')');
		if (state == InterpreterState.head) {
			output.append(";\n");
		} else {
			output.append("\n{\n");
			node.getImpl().apply(this);
			output.append("\n}\n");
		}
		cleanupAfterFunction();
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFunctionProgram(node.AFunctionProgram)
	 */
	@Override
	public void caseAFunctionProgram(AFunctionProgram node) {
		node.getFunction().apply(this);
		node.getProgram().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIdTerm(node.AIdTerm)
	 */
	@Override
	public void caseAIdTerm(AIdTerm node) {
		String currentID = node.getId().getText();
		checkVariable(currentID, AccessType.read, node.getId().getLine());
		output.append(currentID);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIfelseLogic(node.AIfelseLogic)
	 */
	@Override
	public void caseAIfelseLogic(AIfelseLogic node) {
		output.append(CONST_IF);
		output.append('(');
		node.getIf().apply(this);
		output.append(")\n{\n");
		node.getThen().apply(this);
		output.append("\n}\n");
		output.append(CONST_ELSE);
		output.append("\n{\n");
		node.getElse().apply(this);
		output.append("\n}\n");
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIfLogic(node.AIfLogic)
	 */
	@Override
	public void caseAIfLogic(AIfLogic node) {
		output.append(CONST_IF);
		output.append('(');
		node.getIf().apply(this);
		output.append(")\n{\n");
		node.getThen().apply(this);
		output.append("\n}\n");
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIncludeProgram(node.AIncludeProgram)
	 */
	@Override
	public void caseAIncludeProgram(AIncludeProgram node) {
		if (state == InterpreterState.head) {
			// generate Code
			output.append(CONST_INCLUDE);
			output.append(" <");
			output.append(node.getId().getText());
			output.append(".h>\n");
		}
		// consume the rest
		node.getProgram().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseALogicExpr(node.ALogicExpr)
	 */
	@Override
	public void caseALogicExpr(ALogicExpr node) {
		node.getLogic().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAMinusOperation(node.AMinusOperation)
	 */
	@Override
	public void caseAMinusOperation(AMinusOperation node) {
		node.getLeft().apply(this);
		output.append(" - ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAModOperation(node.AModOperation)
	 */
	@Override
	public void caseAModOperation(AModOperation node) {
		node.getLeft().apply(this);
		output.append(" % ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAMultOperation(node.AMultOperation)
	 */
	@Override
	public void caseAMultOperation(AMultOperation node) {
		node.getLeft().apply(this);
		output.append(" * ");
		node.getRight().apply(this);
	}

	@Override
	public void caseANewFunc(ANewFunc node) {
		String currentID = node.getId().getText();
		checkIfStructExists(currentID, node.getNew().getLine());
		output.append("new_");
		signatureOnly = true;
		node.getFuncPara().apply(this);
		signatureOnly = false;

	}

	private void checkIfStructExists(String currentID, int line) {
		if (!avaibleStructs.contains(currentID)) {
			throw new SemanticException("In line " + line + ": Struct " + currentID + " is not defined!");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseANullTerm(node.ANullTerm)
	 */
	@Override
	public void caseANullTerm(ANullTerm node) {
		output.append(CONST_NULL);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseANumberTerm(node.ANumberTerm)
	 */
	@Override
	public void caseANumberTerm(ANumberTerm node) {
		output.append(node.getNumber());
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAOneFuncPara(node.AOneFuncPara)
	 */
	@Override
	public void caseAOneFuncPara(AOneFuncPara node) {
		if (signatureOnly) {
			// TODO: I need the type here
			throw new RuntimeException("This is not implemented due to missing types!");
		}
		node.getTerm().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAOneParam(node.AOneParam)
	 */
	@Override
	public void caseAOneParam(AOneParam node) {
		node.getType().apply(this);
		if (!signatureOnly) {
			output.append(' ');
			String currentID = node.getId().getText();
			output.append(currentID);
			addVariableToScope(currentID, extractType(node.getType()), true, node.getId().getLine());
		} else {
			output.append('_');
		}
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAOperationExpr(node.AOperationExpr)
	 */
	@Override
	public void caseAOperationExpr(AOperationExpr node) {
		node.getOperation().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAPlusOperation(node.APlusOperation)
	 */
	@Override
	public void caseAPlusOperation(APlusOperation node) {
		node.getLeft().apply(this);
		output.append(" + ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAPrintImpl(node.APrintImpl)
	 */
	@Override
	public void caseAPrintImpl(APrintImpl node) {
		output.append("printf(\"%d\\n\",");
		node.getExpr().apply(this);
		output.append(");\n");
		node.getImpl().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAReturnImpl(node.AReturnImpl)
	 */
	@Override
	public void caseAReturnImpl(AReturnImpl node) {
		output.append("return ");
		node.getExpr().apply(this);
		output.append(";\n");
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseASameOperation(node.ASameOperation)
	 */
	@Override
	public void caseASameOperation(ASameOperation node) {
		node.getLeft().apply(this);
		output.append(" == ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseASetExpr(node.ASetExpr)
	 */
	@Override
	public void caseASetExpr(ASetExpr node) {
		node.getSet().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseASetSet(node.ASetSet)
	 */
	@Override
	public void caseASetSet(ASetSet node) {
		String currentID = node.getId().getText();
		int line = node.getId().getLine();

		if (currentStruct != null && currentlyInFunction) {
			if (currentStructVariableScope.containsKey(currentID)) {
				output.append("this -> ");
			} else {
				if (!(currentFunctionVariableScope.containsKey(currentID) || currentGlobalVariableScope
						.containsKey(currentID))) {
					throw new SemanticException("In line " + line + ": There is no variable in struct "
							+ currentStruct.getStruct().getId().getText() + " with the id " + currentID);
				}
			}
		}
		output.append(currentID);
		Variable var = checkVariable(currentID, AccessType.write, line);
		output.append(" = ");
		node.getTerm().apply(this);
		output.append(";\n");
		var.initialize();
	}

	@Override
	public void caseASmallerOperation(ASmallerOperation node) {
		node.getLeft().apply(this);
		output.append(" < ");
		node.getRight().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAStructProgram(node.AStructProgram)
	 */
	@Override
	public void caseAStructProgram(AStructProgram node) {
		node.getStruct().apply(this);
		node.getProgram().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAStructStruct(node.AStructStruct)
	 */
	@Override
	public void caseAStructStruct(AStructStruct node) {
		String currentID = node.getId().getText();
		currentStruct = new StructState(node);
		this.avaibleStructs.add(currentID);

		// generate Code
		output.append("//BEGIN STRUCT ");
		output.append(currentID);
		output.append('\n');
		if (state == InterpreterState.head) {
			output.append(CONST_STRUCT);
			output.append(' ');
			output.append(currentID);
			output.append("\n{\n");
		}
		node.getStructBody().apply(this);

	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseATermExpr(node.ATermExpr)
	 */
	@Override
	public void caseATermExpr(ATermExpr node) {
		node.getTerm().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseATypeType(node.ATypeType)
	 */
	@Override
	public void caseATypeType(ATypeType node) {
		String currentID = node.getId().getText();
		if (isNativeType(currentID)) {
			output.append(currentID);
		} else {
			output.append("struct ");
			output.append(currentID);
			output.append("*");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAVarDefine(node.AVarDefine)
	 */
	@Override
	public void caseAVarDefine(AVarDefine node) {
		String currentID = node.getId().getText();
		if (currentlyInFunction || (state == InterpreterState.head)) {
			node.getType().apply(this);
			output.append(" ");
			output.append(currentID);
			output.append(";\n");
		}
		addVariableToScope(currentID, extractType(node.getType()), false, node.getId().getLine());
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAVarSetDefine(node.AVarSetDefine)
	 */
	@Override
	public void caseAVarSetDefine(AVarSetDefine node) {
		PSet set = node.getSet();
		if (set instanceof ASetSet) {
			ASetSet setSet = (ASetSet) set;
			addVariableToScope(setSet.getId().getText(), extractType(node.getType()), false);
		}
		if (state != InterpreterState.head && !currentlyInFunction)
			return;
		node.getType().apply(this);
		output.append(' ');
		node.getSet().apply(this);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAVoidType(node.AVoidType)
	 */
	@Override
	public void caseAVoidType(AVoidType node) {
		output.append(CONST_VOID);
	}

	/*
	 * (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAWhileLogic(node.AWhileLogic)
	 */
	@Override
	public void caseAWhileLogic(AWhileLogic node) {
		output.append(WHILE);
		output.append('(');
		node.getTerm().apply(this);
		output.append(")\n{\n");
		node.getImpl().apply(this);
		output.append("\n}\n");

	}

	@Override
	public void caseStart(Start node) {
		if (state == null) {
			state = InterpreterState.head;
			node.getPProgram().apply(this);
		}
		switch (state) {
			case head: {
				state = InterpreterState.body;
				output.append("#include \"");
				output.append(moduleName);
				output.append(".h\"\n");
				break;
			}
			default: {
				throw new RuntimeException("Unhandled State! Contact Developer!");
			}
		}

		node.getPProgram().apply(this);
	}

	private void checkUsed(Map<String, Variable> vars) {
		if (state != InterpreterState.body)
			return;

		for (Entry<String, Variable> var : vars.entrySet()) {
			if (!var.getValue().isUsed()) {
				warnings.add("Variable " + var.getKey() + " is unused!");
			}
		}
	}

	private Variable checkVariable(String currentID, AccessType accessType, int line) {
		Variable var = null;
		if (currentFunctionVariableScope.containsKey(currentID)) {
			var = currentFunctionVariableScope.get(currentID);
		}
		if (currentStructVariableScope.containsKey(currentID)) {
			var = currentStructVariableScope.get(currentID);
		}

		if (currentGlobalVariableScope.containsKey(currentID)) {
			var = currentGlobalVariableScope.get(currentID);
		}
		if (var != null) {
			if (accessType == AccessType.read) {
				if (!var.isInitialized()) {
					throw new SemanticException("In line " + line + ":Variable " + var.getId()
							+ " is not initialized, but is used as a right-hand-side of an assignment!");
				}
			} else {
				var.initialize();
			}
			var.Use();
			return var;
		}

		throw new SemanticException("In line " + line + ": Variable " + currentID + " not defined!");
	}

	private void cleanupAfterFunction() {
		checkUsed(currentFunctionVariableScope);
		currentlyInFunction = false;
		currentFunctionVariableScope = new HashMap<String, Variable>();
	}

	private void cleanupAfterGlobal() {
		checkUsed(currentGlobalVariableScope);
		currentGlobalVariableScope = new HashMap<String, Variable>();
	}

	private void cleanupAfterStruct() {
		checkUsed(currentStructVariableScope);
		currentStruct = null;
		currentStructVariableScope = new HashMap<String, Variable>();
	}

	private String extractType(PType type) {
		return type.toString().substring(2, type.toString().indexOf('>'));
	}

	public List<String> getWarnings() {
		return warnings;
	}

	private boolean isNativeType(String type) {
		if (type.equals("int")) {
			return true;
		}
		return false;
	}

	public void resetWarnings() {
		warnings = new ArrayList<String>();
	}

	private void writeOut() throws IOException {
		String path;
		switch (state) {
			case head: {
				path = headerPath;
				break;
			}
			case body: {
				path = bodyPath;
				break;
			}
			default: {
				throw new RuntimeException("Unhandled State! Contact Developer!");
			}
		}

		Writer writer = new FileWriter(path);
		writer.append(output.toString());
		writer.close();

		output = new StringBuffer();
	}

	public void reset() {
		resetWarnings();
		avaibleStructs = new HashSet<String>();
		avaibleFunctions = new HashSet<String>();
	}

}
