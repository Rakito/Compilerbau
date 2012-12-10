package interpreter;

import node.AConsConst;
import node.AConstructorExpr;
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
import node.ANilConst;
import node.ANumberTerm;
import node.AParaParas;
import node.AParasParas;
import node.APlusExpr;
import node.ATermFactor;
import node.PConst;
import node.PExpr;
import node.PFactor;
import node.PFunction;
import node.PIfex;
import node.PParas;
import node.PTerm;
import node.TComment;
import node.TId;
import node.TNumber;

public class CodePrinter {

	public StringBuilder code = new StringBuilder();

	// A

	void doMe(ADivFactor node) {
		doMe(node.getFactor());
		code.append(" / ");
		doMe(node.getTerm());
	}

	void doMe(AExprTerm node) {
		code.append("( ");
		doMe(node.getExpr());
		code.append(" )");
	}

	void doMe(AFactorExpr node) {
		doMe(node.getFactor());
	}

	void doMe(AFunctionExpr node) {
		doMe(node.getFunction());
	}

	void doMe(AFunctionFunction node) {
		code.append("< ");
		doMe(node.getReturns());
		code.append(" >");
		doMe(node.getFuncName());
		code.append("( ");
		doMe(node.getParams());
		code.append(" )");
		code.append("{ ");
		doMe(node.getExpr());
		code.append(" }");
	}

	void doMe(AIdTerm node) {
		code.append(node.getId().getText());

	}

	void doMe(AMinusExpr node) {
		doMe(node.getExpr());
		code.append(" - ");
		doMe(node.getFactor());
	}

	void doMe(AModFactor node) {
		doMe(node.getFactor());
		code.append(" % ");
		doMe(node.getTerm());
	}

	void doMe(AMultFactor node) {
		doMe(node.getFactor());
		code.append(" * ");
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
		code.append(", ");
		doMe(node.getParas());
	}

	void doMe(APlusExpr node) {
		doMe(node.getExpr());
		code.append(" + ");
		doMe(node.getFactor());

	}

	void doMe(ATermFactor node) {
		doMe(node.getTerm());
	}

	void doMe(AConsConst node) {
		code.append("CONS " + node.getConsName().getText().toUpperCase()+"( ");
		doMe(node.getParams());
		code.append(" )");
	}

	void doMe(AConstructorExpr node) {
		doMe(node.getConst());
	}

	void doMe(ANilConst node) {
		code.append("NIL");
	}

	// P

	void doMe(PConst node) {
		if (node instanceof AConsConst) {
			doMe((AConsConst) node);
		} else if (node instanceof ANilConst) {
			doMe((ANilConst) node);
		}
	}

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
		code.append("// " + node.getText());
	}

	void doMe(TId node) {
		code.append(node.getText());
	}

	void doMe(TNumber node, int number) {
		number = new Integer(node.getText());
		code.append(node.getText());
	}
}
