package interpreter;

import java.util.LinkedList;
import java.util.List;

import node.ADivFactor;
import node.AExprTerm;
import node.AFactorExpr;
import node.AFunctionExpr;
import node.AFunctionFunction;
import node.AIdTerm;
import node.AIfex;
import node.AMinusExpr;
import node.AModFactor;
import node.AMultFactor;
import node.ANumberTerm;
import node.AParaParas;
import node.AParasParas;
import node.APlusExpr;
import node.ATermFactor;
import node.PExpr;
import node.PFactor;
import node.PFunction;
import node.PIfex;
import node.PParas;
import node.PTerm;
import node.TComment;
import node.TId;
import node.TNumber;

public class Interpreter2 {

	List<String> output = new LinkedList<String>();

	// A

	void doMe(ADivFactor node) {
		doMe(node.getFactor());
		output.add(" / ");
		doMe(node.getTerm());
	}

	void doMe(AExprTerm node) {
		output.add("( ");
		doMe(node.getExpr());
		output.add(" )");
	}

	void doMe(AFactorExpr node) {
		doMe(node.getFactor());
	}

	void doMe(AFunctionExpr node) {
		doMe(node.getFunction());
	}

	void doMe(AFunctionFunction node) {
		output.add("< ");
		doMe(node.getReturns());
		output.add(" >");
		doMe(node.getFuncName());
		output.add("( ");
		doMe(node.getParams());
		output.add(" )");
		output.add("{ ");
		doMe(node.getExpr());
		output.add(" }");
	}

	void doMe(AIdTerm node) {
		output.add(node.getId().getText());

	}

	void doMe(AMinusExpr node) {
		doMe(node.getExpr());
		output.add(" - ");
		doMe(node.getFactor());
	}

	void doMe(AModFactor node) {
		doMe(node.getFactor());
		output.add(" % ");
		doMe(node.getTerm());
	}

	void doMe(AMultFactor node) {
		doMe(node.getFactor());
		output.add(" * ");
		doMe(node.getTerm());
	}

	void doMe(ANumberTerm node) {
		int number = 0;
		doMe(node.getNumber(), number);
	}

	void doMe(AParaParas node) {
		doMe(node.getExpr());
	}

	void doMe(AParasParas node) {
		doMe(node.getExpr());
		output.add(", ");
		doMe(node.getParas());
	}

	void doMe(APlusExpr node) {
		doMe(node.getExpr());
		output.add(" + ");
		doMe(node.getFactor());

	}

	void doMe(ATermFactor node) {
		doMe(node.getTerm());
	}

	// P

	void doMe(PExpr node) {
		if (node instanceof APlusExpr) {
			doMe((APlusExpr) node);
		} else if (node instanceof AMinusExpr) {
			doMe((AMinusExpr) node);
		} else if (node instanceof AFactorExpr) {
			doMe((AFactorExpr) node);
		} else if (node instanceof AFunctionExpr) {
			doMe((AFunctionExpr) node);
		}

	}

	void doMe(PFactor node) {
		if (node instanceof ATermFactor) {
			doMe((ATermFactor) node);
		} else if (node instanceof AMultFactor) {
			doMe((AMultFactor) node);
		} else if (node instanceof ADivFactor) {
			doMe((ADivFactor) node);
		} else if (node instanceof AModFactor) {
			doMe((AModFactor) node);
		}

	}

	void doMe(PFunction node) {
		doMe((AFunctionFunction) node);

	}

	void doMe(PIfex node) {
		doMe((AIfex) node);
	}

	void doMe(PParas node) {
		if (node instanceof AParasParas) {
			doMe((AParasParas) node);
		} else if (node instanceof AParaParas) {
			doMe((AParaParas) node);
		}
	}

	void doMe(PTerm node) {
		if (node instanceof AExprTerm) {
			doMe((AExprTerm) node);
		} else if (node instanceof AIdTerm) {
			doMe((AIdTerm) node);
		} else if (node instanceof ANumberTerm) {
			doMe((ANumberTerm) node);
		}

	}

	// T

	void doMe(TComment node) {
		output.add("// " + node.getText());
	}

	void doMe(TId node) {
		output.add(node.getText());
	}

	void doMe(TNumber node, int number) {
		number = new Integer(node.getText());
		output.add(node.getText());
	}
}
