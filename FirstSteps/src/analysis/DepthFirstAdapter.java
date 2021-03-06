/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAEofProgram(AEofProgram node)
    {
        defaultIn(node);
    }

    public void outAEofProgram(AEofProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEofProgram(AEofProgram node)
    {
        inAEofProgram(node);
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        outAEofProgram(node);
    }

    public void inAIncludeProgram(AIncludeProgram node)
    {
        defaultIn(node);
    }

    public void outAIncludeProgram(AIncludeProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIncludeProgram(AIncludeProgram node)
    {
        inAIncludeProgram(node);
        if(node.getInclude() != null)
        {
            node.getInclude().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAIncludeProgram(node);
    }

    public void inADefineProgram(ADefineProgram node)
    {
        defaultIn(node);
    }

    public void outADefineProgram(ADefineProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineProgram(ADefineProgram node)
    {
        inADefineProgram(node);
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outADefineProgram(node);
    }

    public void inAStructProgram(AStructProgram node)
    {
        defaultIn(node);
    }

    public void outAStructProgram(AStructProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStructProgram(AStructProgram node)
    {
        inAStructProgram(node);
        if(node.getStruct() != null)
        {
            node.getStruct().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAStructProgram(node);
    }

    public void inAFunctionProgram(AFunctionProgram node)
    {
        defaultIn(node);
    }

    public void outAFunctionProgram(AFunctionProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionProgram(AFunctionProgram node)
    {
        inAFunctionProgram(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAFunctionProgram(node);
    }

    public void inAVarDefine(AVarDefine node)
    {
        defaultIn(node);
    }

    public void outAVarDefine(AVarDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDefine(AVarDefine node)
    {
        inAVarDefine(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAVarDefine(node);
    }

    public void inAVarSetDefine(AVarSetDefine node)
    {
        defaultIn(node);
    }

    public void outAVarSetDefine(AVarSetDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarSetDefine(AVarSetDefine node)
    {
        inAVarSetDefine(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getSet() != null)
        {
            node.getSet().apply(this);
        }
        outAVarSetDefine(node);
    }

    public void inAStructStruct(AStructStruct node)
    {
        defaultIn(node);
    }

    public void outAStructStruct(AStructStruct node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStructStruct(AStructStruct node)
    {
        inAStructStruct(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getStructBody() != null)
        {
            node.getStructBody().apply(this);
        }
        outAStructStruct(node);
    }

    public void inAEndStructBody(AEndStructBody node)
    {
        defaultIn(node);
    }

    public void outAEndStructBody(AEndStructBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndStructBody(AEndStructBody node)
    {
        inAEndStructBody(node);
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAEndStructBody(node);
    }

    public void inADefineStructBody(ADefineStructBody node)
    {
        defaultIn(node);
    }

    public void outADefineStructBody(ADefineStructBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineStructBody(ADefineStructBody node)
    {
        inADefineStructBody(node);
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        if(node.getStructBody() != null)
        {
            node.getStructBody().apply(this);
        }
        outADefineStructBody(node);
    }

    public void inAConstructorStructBody(AConstructorStructBody node)
    {
        defaultIn(node);
    }

    public void outAConstructorStructBody(AConstructorStructBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstructorStructBody(AConstructorStructBody node)
    {
        inAConstructorStructBody(node);
        if(node.getConstructor() != null)
        {
            node.getConstructor().apply(this);
        }
        if(node.getStructBody() != null)
        {
            node.getStructBody().apply(this);
        }
        outAConstructorStructBody(node);
    }

    public void inAConsConstructor(AConsConstructor node)
    {
        defaultIn(node);
    }

    public void outAConsConstructor(AConsConstructor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConsConstructor(AConsConstructor node)
    {
        inAConsConstructor(node);
        if(node.getCons() != null)
        {
            node.getCons().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outAConsConstructor(node);
    }

    public void inAFunctionFunction(AFunctionFunction node)
    {
        defaultIn(node);
    }

    public void outAFunctionFunction(AFunctionFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionFunction(AFunctionFunction node)
    {
        inAFunctionFunction(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outAFunctionFunction(node);
    }

    public void inAEndParam(AEndParam node)
    {
        defaultIn(node);
    }

    public void outAEndParam(AEndParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndParam(AEndParam node)
    {
        inAEndParam(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAEndParam(node);
    }

    public void inAOneParam(AOneParam node)
    {
        defaultIn(node);
    }

    public void outAOneParam(AOneParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOneParam(AOneParam node)
    {
        inAOneParam(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAOneParam(node);
    }

    public void inAAnotherParam(AAnotherParam node)
    {
        defaultIn(node);
    }

    public void outAAnotherParam(AAnotherParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAnotherParam(AAnotherParam node)
    {
        inAAnotherParam(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        outAAnotherParam(node);
    }

    public void inAEndImpl(AEndImpl node)
    {
        defaultIn(node);
    }

    public void outAEndImpl(AEndImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndImpl(AEndImpl node)
    {
        inAEndImpl(node);
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAEndImpl(node);
    }

    public void inAReturnImpl(AReturnImpl node)
    {
        defaultIn(node);
    }

    public void outAReturnImpl(AReturnImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnImpl(AReturnImpl node)
    {
        inAReturnImpl(node);
        if(node.getReturnt() != null)
        {
            node.getReturnt().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAReturnImpl(node);
    }

    public void inAPrintImpl(APrintImpl node)
    {
        defaultIn(node);
    }

    public void outAPrintImpl(APrintImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintImpl(APrintImpl node)
    {
        inAPrintImpl(node);
        if(node.getAt() != null)
        {
            node.getAt().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outAPrintImpl(node);
    }

    public void inAExprImpl(AExprImpl node)
    {
        defaultIn(node);
    }

    public void outAExprImpl(AExprImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprImpl(AExprImpl node)
    {
        inAExprImpl(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outAExprImpl(node);
    }

    public void inADefineImpl(ADefineImpl node)
    {
        defaultIn(node);
    }

    public void outADefineImpl(ADefineImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineImpl(ADefineImpl node)
    {
        inADefineImpl(node);
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outADefineImpl(node);
    }

    public void inAOperationExpr(AOperationExpr node)
    {
        defaultIn(node);
    }

    public void outAOperationExpr(AOperationExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperationExpr(AOperationExpr node)
    {
        inAOperationExpr(node);
        if(node.getOperation() != null)
        {
            node.getOperation().apply(this);
        }
        outAOperationExpr(node);
    }

    public void inAFuncExpr(AFuncExpr node)
    {
        defaultIn(node);
    }

    public void outAFuncExpr(AFuncExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncExpr(AFuncExpr node)
    {
        inAFuncExpr(node);
        if(node.getFunc() != null)
        {
            node.getFunc().apply(this);
        }
        outAFuncExpr(node);
    }

    public void inALogicExpr(ALogicExpr node)
    {
        defaultIn(node);
    }

    public void outALogicExpr(ALogicExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALogicExpr(ALogicExpr node)
    {
        inALogicExpr(node);
        if(node.getLogic() != null)
        {
            node.getLogic().apply(this);
        }
        outALogicExpr(node);
    }

    public void inATermExpr(ATermExpr node)
    {
        defaultIn(node);
    }

    public void outATermExpr(ATermExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermExpr(ATermExpr node)
    {
        inATermExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermExpr(node);
    }

    public void inASetExpr(ASetExpr node)
    {
        defaultIn(node);
    }

    public void outASetExpr(ASetExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASetExpr(ASetExpr node)
    {
        inASetExpr(node);
        if(node.getSet() != null)
        {
            node.getSet().apply(this);
        }
        outASetExpr(node);
    }

    public void inASetSet(ASetSet node)
    {
        defaultIn(node);
    }

    public void outASetSet(ASetSet node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASetSet(ASetSet node)
    {
        inASetSet(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getEquals() != null)
        {
            node.getEquals().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outASetSet(node);
    }

    public void inAFuncFunc(AFuncFunc node)
    {
        defaultIn(node);
    }

    public void outAFuncFunc(AFuncFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncFunc(AFuncFunc node)
    {
        inAFuncFunc(node);
        if(node.getCall() != null)
        {
            node.getCall().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFuncPara() != null)
        {
            node.getFuncPara().apply(this);
        }
        outAFuncFunc(node);
    }

    public void inANewFunc(ANewFunc node)
    {
        defaultIn(node);
    }

    public void outANewFunc(ANewFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewFunc(ANewFunc node)
    {
        inANewFunc(node);
        if(node.getNew() != null)
        {
            node.getNew().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFuncPara() != null)
        {
            node.getFuncPara().apply(this);
        }
        outANewFunc(node);
    }

    public void inADestroyFunc(ADestroyFunc node)
    {
        defaultIn(node);
    }

    public void outADestroyFunc(ADestroyFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADestroyFunc(ADestroyFunc node)
    {
        inADestroyFunc(node);
        if(node.getDestroy() != null)
        {
            node.getDestroy().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outADestroyFunc(node);
    }

    public void inAEndFuncPara(AEndFuncPara node)
    {
        defaultIn(node);
    }

    public void outAEndFuncPara(AEndFuncPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndFuncPara(AEndFuncPara node)
    {
        inAEndFuncPara(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAEndFuncPara(node);
    }

    public void inAOneFuncPara(AOneFuncPara node)
    {
        defaultIn(node);
    }

    public void outAOneFuncPara(AOneFuncPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOneFuncPara(AOneFuncPara node)
    {
        inAOneFuncPara(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAOneFuncPara(node);
    }

    public void inAAnotherFuncPara(AAnotherFuncPara node)
    {
        defaultIn(node);
    }

    public void outAAnotherFuncPara(AAnotherFuncPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAnotherFuncPara(AAnotherFuncPara node)
    {
        inAAnotherFuncPara(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getFuncPara() != null)
        {
            node.getFuncPara().apply(this);
        }
        outAAnotherFuncPara(node);
    }

    public void inAIfLogic(AIfLogic node)
    {
        defaultIn(node);
    }

    public void outAIfLogic(AIfLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfLogic(AIfLogic node)
    {
        inAIfLogic(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getQuery() != null)
        {
            node.getQuery().apply(this);
        }
        if(node.getThenin() != null)
        {
            node.getThenin().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        outAIfLogic(node);
    }

    public void inAIfelseLogic(AIfelseLogic node)
    {
        defaultIn(node);
    }

    public void outAIfelseLogic(AIfelseLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfelseLogic(AIfelseLogic node)
    {
        inAIfelseLogic(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getQuery() != null)
        {
            node.getQuery().apply(this);
        }
        if(node.getThenin() != null)
        {
            node.getThenin().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getElsein() != null)
        {
            node.getElsein().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAIfelseLogic(node);
    }

    public void inAWhileLogic(AWhileLogic node)
    {
        defaultIn(node);
    }

    public void outAWhileLogic(AWhileLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileLogic(AWhileLogic node)
    {
        inAWhileLogic(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        outAWhileLogic(node);
    }

    public void inASameOperation(ASameOperation node)
    {
        defaultIn(node);
    }

    public void outASameOperation(ASameOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASameOperation(ASameOperation node)
    {
        inASameOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getIs() != null)
        {
            node.getIs().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASameOperation(node);
    }

    public void inAPlusOperation(APlusOperation node)
    {
        defaultIn(node);
    }

    public void outAPlusOperation(APlusOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusOperation(APlusOperation node)
    {
        inAPlusOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAPlusOperation(node);
    }

    public void inASmallerOperation(ASmallerOperation node)
    {
        defaultIn(node);
    }

    public void outASmallerOperation(ASmallerOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASmallerOperation(ASmallerOperation node)
    {
        inASmallerOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getSmaller() != null)
        {
            node.getSmaller().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASmallerOperation(node);
    }

    public void inABiggerOperation(ABiggerOperation node)
    {
        defaultIn(node);
    }

    public void outABiggerOperation(ABiggerOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABiggerOperation(ABiggerOperation node)
    {
        inABiggerOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getBigger() != null)
        {
            node.getBigger().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outABiggerOperation(node);
    }

    public void inAMinusOperation(AMinusOperation node)
    {
        defaultIn(node);
    }

    public void outAMinusOperation(AMinusOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusOperation(AMinusOperation node)
    {
        inAMinusOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusOperation(node);
    }

    public void inAMultOperation(AMultOperation node)
    {
        defaultIn(node);
    }

    public void outAMultOperation(AMultOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultOperation(AMultOperation node)
    {
        inAMultOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultOperation(node);
    }

    public void inADivOperation(ADivOperation node)
    {
        defaultIn(node);
    }

    public void outADivOperation(ADivOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivOperation(ADivOperation node)
    {
        inADivOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivOperation(node);
    }

    public void inAModOperation(AModOperation node)
    {
        defaultIn(node);
    }

    public void outAModOperation(AModOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModOperation(AModOperation node)
    {
        inAModOperation(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPercent() != null)
        {
            node.getPercent().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModOperation(node);
    }

    public void inAExprTerm(AExprTerm node)
    {
        defaultIn(node);
    }

    public void outAExprTerm(AExprTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprTerm(AExprTerm node)
    {
        inAExprTerm(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAExprTerm(node);
    }

    public void inAIdTerm(AIdTerm node)
    {
        defaultIn(node);
    }

    public void outAIdTerm(AIdTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        inAIdTerm(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdTerm(node);
    }

    public void inANumberTerm(ANumberTerm node)
    {
        defaultIn(node);
    }

    public void outANumberTerm(ANumberTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberTerm(ANumberTerm node)
    {
        inANumberTerm(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberTerm(node);
    }

    public void inANullTerm(ANullTerm node)
    {
        defaultIn(node);
    }

    public void outANullTerm(ANullTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANullTerm(ANullTerm node)
    {
        inANullTerm(node);
        if(node.getNull() != null)
        {
            node.getNull().apply(this);
        }
        outANullTerm(node);
    }

    public void inABoolTerm(ABoolTerm node)
    {
        defaultIn(node);
    }

    public void outABoolTerm(ABoolTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolTerm(ABoolTerm node)
    {
        inABoolTerm(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolTerm(node);
    }

    public void inAVoidType(AVoidType node)
    {
        defaultIn(node);
    }

    public void outAVoidType(AVoidType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        inAVoidType(node);
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        if(node.getRArrow() != null)
        {
            node.getRArrow().apply(this);
        }
        outAVoidType(node);
    }

    public void inATypeType(ATypeType node)
    {
        defaultIn(node);
    }

    public void outATypeType(ATypeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypeType(ATypeType node)
    {
        inATypeType(node);
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getRArrow() != null)
        {
            node.getRArrow().apply(this);
        }
        outATypeType(node);
    }
}
