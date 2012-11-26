package interpreter;

import node.*;
import analysis.*;
import java.lang.System; 

public class Interpreter extends DepthFirstAdapter {
	
	@Override
	public void caseAExprTerm(AExprTerm node) {
		System.out.println("( "+node.getExpr()+" )");
	}
	
	@Override
	public void caseAFactorExpr(AFactorExpr node) {
		// TODO Auto-generated method stub
		super.caseAFactorExpr(node);
	}

	

	

	@Override
	public void caseAFunctionExpr(AFunctionExpr node) {
		// TODO Auto-generated method stub
		super.caseAFunctionExpr(node);
	}

	@Override
	public void caseAFunctionFunction(AFunctionFunction node) {
		// TODO Auto-generated method stub
		super.caseAFunctionFunction(node);
	}

	@Override
	public void caseAIdTerm(AIdTerm node) {
		System.out.println(node.getId().getText());
	}

	@Override
	public void caseAIfex(AIfex node) { 
		String _if = node.getLeft().toString();
		String _then = node.getMiddle().toString();
		String _else = node.getRight().toString();
		if (new Integer(_if).intValue() != 0) {
			System.out.println(_then);
		} else {
			System.out.println(_else);
		}
	 }

	@Override
	public void caseAMinusExpr(AMinusExpr node) {
		System.out.println("Eine Subtraktion");
	      String lhs = node.getExpr().toString().trim(); 
	      String rhs = node.getFactor().toString().trim(); 
	      int result = (new Integer(lhs)).intValue() - (new Integer(rhs)).intValue(); 
	      System.out.println(lhs + "-" + rhs + "=" + result); 
	}

	@Override
	public void caseAModFactor(AModFactor node) {
		System.out.println(new Integer(node.getFactor())+" / "+node.getTerm().);
	}

	@Override
	public void caseAMultFactor(AMultFactor node) {
		// TODO Auto-generated method stub
		super.caseAMultFactor(node);
	}

	@Override
	public void caseANumberTerm(ANumberTerm node) {
		System.out.println(new Integer(node.getNumber().getText())+"");
	}

	@Override
	public void caseAParaParas(AParaParas node) {
		// TODO Auto-generated method stub
		super.caseAParaParas(node);
	}

	@Override
	public void caseAParasParas(AParasParas node) {
		// TODO Auto-generated method stub
		super.caseAParasParas(node);
	}

	@Override
	public void caseAPlusExpr(APlusExpr node) { 
		System.out.println("Eine Addition");
	      String lhs = node.getExpr().toString().trim(); 
	      String rhs = node.getFactor().toString().trim(); 
	      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
	      System.out.println(lhs + "+" + rhs + "=" + result); 
	   
	      
	}

	@Override
	public void caseATermFactor(ATermFactor node) {
		// TODO Auto-generated method stub
		super.caseATermFactor(node);
	}

	
	
	
}
