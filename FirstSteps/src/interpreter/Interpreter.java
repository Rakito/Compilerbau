package interpreter;

import node.*;
import analysis.*;
import java.lang.System; 

import interpreter.CodePrinter;

public class Interpreter extends DepthFirstAdapter {
	
	public CodePrinter cp = new CodePrinter();

	@Override
	public void caseAParaParas(AParaParas node) {
		cp.doMe(node);
	}

	@Override
	public void caseAParasParas(AParasParas node) {
		cp.doMe(node);
	}

	@Override
	public void caseAIfex(AIfex node) {
		cp.doMe(node);
	}

	@Override
	public void caseAFactorExpr(AFactorExpr node) {
		cp.doMe(node);
	}

	@Override
	public void caseAFunctionExpr(AFunctionExpr node) {
		cp.doMe(node);
	}

	@Override
	public void caseAPlusExpr(APlusExpr node) {
		cp.doMe(node);
	}

	@Override
	public void caseAMinusExpr(AMinusExpr node) {
		cp.doMe(node);
	}

	@Override
	public void caseAFunctionFunction(AFunctionFunction node) {
		cp.doMe(node);
	}

	@Override
	public void caseATermFactor(ATermFactor node) {
		cp.doMe(node);
	}

	@Override
	public void caseAMultFactor(AMultFactor node) {
		cp.doMe(node);
	}

	@Override
	public void caseADivFactor(ADivFactor node) {
		cp.doMe(node);
	}

	@Override
	public void caseAModFactor(AModFactor node) {
		cp.doMe(node);
	}

	@Override
	public void caseANumberTerm(ANumberTerm node) {
		cp.doMe(node);
	}

	@Override
	public void caseAIdTerm(AIdTerm node) {
		cp.doMe(node);
	}

	@Override
	public void caseAExprTerm(AExprTerm node) {
		cp.doMe(node);
	}
	
	
	
	

//	@Override
//	public void caseAIfex(AIfex node) { 
//		String _if = node.getLeft().toString();
//		String _then = node.getMiddle().toString();
//		String _else = node.getRight().toString();
//		if (new Integer(_if).intValue() != 0) {
//			System.out.println(_then);
//		} else {
//			System.out.println(_else);
//		}
//	 }

//	@Override
//	public void caseAMinusExpr(AMinusExpr node) {
//		System.out.println("Eine Subtraktion");
//	      String lhs = node.getExpr().toString().trim(); 
//	      String rhs = node.getFactor().toString().trim(); 
//	      int result = (new Integer(lhs)).intValue() - (new Integer(rhs)).intValue(); 
//	      System.out.println(lhs + "-" + rhs + "=" + result); 
//	}

	

//	@Override
//	public void caseAPlusExpr(APlusExpr node) { 
//		System.out.println("Eine Addition");
//	      String lhs = node.getExpr().toString().trim(); 
//	      String rhs = node.getFactor().toString().trim(); 
//	      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
//	      System.out.println(lhs + "+" + rhs + "=" + result); 
//	   
//	      
//	}

	

	
	
	
}
