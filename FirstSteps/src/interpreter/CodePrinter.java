package interpreter;

import java.util.LinkedList;
import java.util.List;

import node.AConsConst;
import node.AConstructorExpr;
import node.ADefineDef;
import node.ADivFactor;
import node.AExprTerm;
import node.AFactorExpr;
import node.AFunctionExpr;
import node.AFunctionFunction;
import node.AIdTerm;
import node.AIfex;
import node.AImpl;
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
import node.PDef;
import node.PExpr;
import node.PFactor;
import node.PFunction;
import node.PIfex;
import node.PImpl;
import node.PParas;
import node.PTerm;
import node.TComment;
import node.TId;
import node.TNumber;

public class CodePrinter {

	List<String> code = new LinkedList<String>();

	// A

	void doMe(ADefineDef node) {
		doMe(node.getId());
		code.add(" = ");
		doMe(node.getExpr());

	}

	void doMe(AImpl node) {
		code.add("{ ");
		node.getExpr();
		code.add(" }");
	}

	void doMe(ADivFactor node) {
		doMe(node.getFactor());
		code.add(" / ");
		doMe(node.getTerm());
	}

	void doMe(AExprTerm node) {
		code.add("( ");
		doMe(node.getExpr());
		code.add(" )");
	}

	void doMe(AFactorExpr node) {
		doMe(node.getFactor());
	}

	void doMe(AFunctionExpr node) {
		doMe(node.getFunction());
	}

	void doMe(AFunctionFunction node) {
		code.add("< ");
		doMe(node.getReturns());
		code.add(" >");
		doMe(node.getFuncName());
		code.add("( ");
		doMe(node.getParams());
		code.add(" )");
		doMe(node.getImpl());

	}

	void doMe(AIdTerm node) {
		code.add(node.getId().getText());

	}

	void doMe(AMinusExpr node) {
		doMe(node.getExpr());
		code.add(" - ");
		doMe(node.getFactor());
	}

	void doMe(AModFactor node) {
		doMe(node.getFactor());
		code.add(" % ");
		doMe(node.getTerm());
	}

	void doMe(AMultFactor node) {
		doMe(node.getFactor());
		code.add(" * ");
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
		code.add(", ");
		doMe(node.getParas());
	}

	void doMe(APlusExpr node) {
		doMe(node.getExpr());
		code.add(" + ");
		doMe(node.getFactor());

	}

	void doMe(ATermFactor node) {
		doMe(node.getTerm());
	}

	void doMe(AConsConst node) {
		code.add(node.getConsName().getText().toUpperCase() + "( ");
		doMe(node.getParams());
		code.add(" )");
	}

	void doMe(AConstructorExpr node) {
		doMe(node.getConst());
	}

	void doMe(ANilConst node) {
		code.add("NIL");
	}

	// P

	void doMe(PImpl node) {
		doMe((AImpl) node);
	};

	void doMe(PDef node) {
		doMe((ADefineDef) node);
	};

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
		code.add("// " + node.getText());
	}

	void doMe(TId node) {
		code.add(node.getText());
	}

	void doMe(TNumber node, int number) {
		number = new Integer(node.getText());
		code.add(node.getText());
	}
}
