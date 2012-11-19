package interpreter;

import node.*;
import analysis.*;
import java.lang.System; 

public class Interpreter extends DepthFirstAdapter {
	
	@Override
	public void caseAPlusExpr(APlusExpr node) { 
		System.out.println("Eine Addition");
	      String lhs = node.getExpr().toString().trim(); 
	      String rhs = node.getFactor().toString().trim(); 
	      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
	      System.out.println(lhs + "+" + rhs + "=" + result); 
	   
	      
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
	public void caseAFunction(ATermFactor node) {
		// TODO Auto-generated method stub
		super.caseATermFactor(node);
	}
	
	@Override
	public void caseATermFactor(ATermFactor node) {
		// TODO Auto-generated method stub
		super.caseATermFactor(node);
	}

	@Override
	public void caseAMultFactor(AMultFactor node) {
		// TODO Auto-generated method stub
		super.caseAMultFactor(node);
	}

	@Override
	public void caseADivFactor(ADivFactor node) {
		// TODO Auto-generated method stub
		super.caseADivFactor(node);
	}

	@Override
	public void caseAModFactor(AModFactor node) {
		// TODO Auto-generated method stub
		super.caseAModFactor(node);
	}

	@Override
	public void caseANumberTerm(ANumberTerm node) {
		int value = new Integer(""+node.getNumber());
	}

	@Override
	public void caseAIdTerm(AIdTerm node) {
		// TODO Auto-generated method stub
		super.caseAIdTerm(node);
	}

	@Override
	public void caseAExprTerm(AExprTerm node) {
		// TODO Auto-generated method stub
		super.caseAExprTerm(node);
	}
	

	
	
}
