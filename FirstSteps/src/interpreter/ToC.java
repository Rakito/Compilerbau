/**
 * 
 */
package interpreter;

import node.*;
import analysis.DepthFirstAdapter;

/**
 * @author Benjamin Arnold, Felix Hoeborn
 *
 */
public class ToC extends DepthFirstAdapter {

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseStart(node.Start)
	 */
	@Override
	public void caseStart(Start node) {
		// TODO Auto-generated method stub
		super.caseStart(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADefineDefine(node.ADefineDefine)
	 */
	@Override
	public void caseADefineDefine(ADefineDefine node) {
		// TODO Auto-generated method stub
		super.caseADefineDefine(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFunctionDefine(node.AFunctionDefine)
	 */
	@Override
	public void caseAFunctionDefine(AFunctionDefine node) {
		// TODO Auto-generated method stub
		super.caseAFunctionDefine(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAConsDefine(node.AConsDefine)
	 */
	@Override
	public void caseAConsDefine(AConsDefine node) {
		// TODO Auto-generated method stub
		super.caseAConsDefine(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseANilDefine(node.ANilDefine)
	 */
	@Override
	public void caseANilDefine(ANilDefine node) {
		// TODO Auto-generated method stub
		super.caseANilDefine(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAExprImpl(node.AExprImpl)
	 */
	@Override
	public void caseAExprImpl(AExprImpl node) {
		// TODO Auto-generated method stub
		super.caseAExprImpl(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAImplexprImpl(node.AImplexprImpl)
	 */
	@Override
	public void caseAImplexprImpl(AImplexprImpl node) {
		// TODO Auto-generated method stub
		super.caseAImplexprImpl(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseATermExpr(node.ATermExpr)
	 */
	@Override
	public void caseATermExpr(ATermExpr node) {
		// TODO Auto-generated method stub
		super.caseATermExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFunctionExpr(node.AFunctionExpr)
	 */
	@Override
	public void caseAFunctionExpr(AFunctionExpr node) {
		// TODO Auto-generated method stub
		super.caseAFunctionExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAPlusExpr(node.APlusExpr)
	 */
	@Override
	public void caseAPlusExpr(APlusExpr node) {
		// TODO Auto-generated method stub
		super.caseAPlusExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAMinusExpr(node.AMinusExpr)
	 */
	@Override
	public void caseAMinusExpr(AMinusExpr node) {
		// TODO Auto-generated method stub
		super.caseAMinusExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAMultExpr(node.AMultExpr)
	 */
	@Override
	public void caseAMultExpr(AMultExpr node) {
		// TODO Auto-generated method stub
		super.caseAMultExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseADivExpr(node.ADivExpr)
	 */
	@Override
	public void caseADivExpr(ADivExpr node) {
		// TODO Auto-generated method stub
		super.caseADivExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAModExpr(node.AModExpr)
	 */
	@Override
	public void caseAModExpr(AModExpr node) {
		// TODO Auto-generated method stub
		super.caseAModExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIfExpr(node.AIfExpr)
	 */
	@Override
	public void caseAIfExpr(AIfExpr node) {
		// TODO Auto-generated method stub
		super.caseAIfExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAConcatExpr(node.AConcatExpr)
	 */
	@Override
	public void caseAConcatExpr(AConcatExpr node) {
		// TODO Auto-generated method stub
		super.caseAConcatExpr(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAFuncCallFunction(node.AFuncCallFunction)
	 */
	@Override
	public void caseAFuncCallFunction(AFuncCallFunction node) {
		// TODO Auto-generated method stub
		super.caseAFuncCallFunction(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAIdTerm(node.AIdTerm)
	 */
	@Override
	public void caseAIdTerm(AIdTerm node) {
		// TODO Auto-generated method stub
		super.caseAIdTerm(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseANumberTerm(node.ANumberTerm)
	 */
	@Override
	public void caseANumberTerm(ANumberTerm node) {
		// TODO Auto-generated method stub
		super.caseANumberTerm(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseANullTerm(node.ANullTerm)
	 */
	@Override
	public void caseANullTerm(ANullTerm node) {
		// TODO Auto-generated method stub
		super.caseANullTerm(node);
	}

	/* (non-Javadoc)
	 * @see analysis.DepthFirstAdapter#caseAExprTerm(node.AExprTerm)
	 */
	@Override
	public void caseAExprTerm(AExprTerm node) {
		// TODO Auto-generated method stub
		super.caseAExprTerm(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTDefine(node.TDefine)
	 */
	@Override
	public void caseTDefine(TDefine node) {
		// TODO Auto-generated method stub
		super.caseTDefine(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTFunc(node.TFunc)
	 */
	@Override
	public void caseTFunc(TFunc node) {
		// TODO Auto-generated method stub
		super.caseTFunc(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTBegin(node.TBegin)
	 */
	@Override
	public void caseTBegin(TBegin node) {
		// TODO Auto-generated method stub
		super.caseTBegin(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTEnd(node.TEnd)
	 */
	@Override
	public void caseTEnd(TEnd node) {
		// TODO Auto-generated method stub
		super.caseTEnd(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTCons(node.TCons)
	 */
	@Override
	public void caseTCons(TCons node) {
		// TODO Auto-generated method stub
		super.caseTCons(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTWhere(node.TWhere)
	 */
	@Override
	public void caseTWhere(TWhere node) {
		// TODO Auto-generated method stub
		super.caseTWhere(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTBreak(node.TBreak)
	 */
	@Override
	public void caseTBreak(TBreak node) {
		// TODO Auto-generated method stub
		super.caseTBreak(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTTrue(node.TTrue)
	 */
	@Override
	public void caseTTrue(TTrue node) {
		// TODO Auto-generated method stub
		super.caseTTrue(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTFalse(node.TFalse)
	 */
	@Override
	public void caseTFalse(TFalse node) {
		// TODO Auto-generated method stub
		super.caseTFalse(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTReturnt(node.TReturnt)
	 */
	@Override
	public void caseTReturnt(TReturnt node) {
		// TODO Auto-generated method stub
		super.caseTReturnt(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTNull(node.TNull)
	 */
	@Override
	public void caseTNull(TNull node) {
		// TODO Auto-generated method stub
		super.caseTNull(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTId(node.TId)
	 */
	@Override
	public void caseTId(TId node) {
		// TODO Auto-generated method stub
		super.caseTId(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTNumber(node.TNumber)
	 */
	@Override
	public void caseTNumber(TNumber node) {
		// TODO Auto-generated method stub
		super.caseTNumber(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTPlus(node.TPlus)
	 */
	@Override
	public void caseTPlus(TPlus node) {
		// TODO Auto-generated method stub
		super.caseTPlus(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTHyphen(node.THyphen)
	 */
	@Override
	public void caseTHyphen(THyphen node) {
		// TODO Auto-generated method stub
		super.caseTHyphen(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTAsterisk(node.TAsterisk)
	 */
	@Override
	public void caseTAsterisk(TAsterisk node) {
		// TODO Auto-generated method stub
		super.caseTAsterisk(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTPercent(node.TPercent)
	 */
	@Override
	public void caseTPercent(TPercent node) {
		// TODO Auto-generated method stub
		super.caseTPercent(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTDot(node.TDot)
	 */
	@Override
	public void caseTDot(TDot node) {
		// TODO Auto-generated method stub
		super.caseTDot(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTComma(node.TComma)
	 */
	@Override
	public void caseTComma(TComma node) {
		// TODO Auto-generated method stub
		super.caseTComma(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTQuery(node.TQuery)
	 */
	@Override
	public void caseTQuery(TQuery node) {
		// TODO Auto-generated method stub
		super.caseTQuery(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTColon(node.TColon)
	 */
	@Override
	public void caseTColon(TColon node) {
		// TODO Auto-generated method stub
		super.caseTColon(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTSemicolon(node.TSemicolon)
	 */
	@Override
	public void caseTSemicolon(TSemicolon node) {
		// TODO Auto-generated method stub
		super.caseTSemicolon(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTLBox(node.TLBox)
	 */
	@Override
	public void caseTLBox(TLBox node) {
		// TODO Auto-generated method stub
		super.caseTLBox(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTRBox(node.TRBox)
	 */
	@Override
	public void caseTRBox(TRBox node) {
		// TODO Auto-generated method stub
		super.caseTRBox(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTLPar(node.TLPar)
	 */
	@Override
	public void caseTLPar(TLPar node) {
		// TODO Auto-generated method stub
		super.caseTLPar(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTRPar(node.TRPar)
	 */
	@Override
	public void caseTRPar(TRPar node) {
		// TODO Auto-generated method stub
		super.caseTRPar(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTLBrace(node.TLBrace)
	 */
	@Override
	public void caseTLBrace(TLBrace node) {
		// TODO Auto-generated method stub
		super.caseTLBrace(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTRBrace(node.TRBrace)
	 */
	@Override
	public void caseTRBrace(TRBrace node) {
		// TODO Auto-generated method stub
		super.caseTRBrace(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTLArrow(node.TLArrow)
	 */
	@Override
	public void caseTLArrow(TLArrow node) {
		// TODO Auto-generated method stub
		super.caseTLArrow(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTRArrow(node.TRArrow)
	 */
	@Override
	public void caseTRArrow(TRArrow node) {
		// TODO Auto-generated method stub
		super.caseTRArrow(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTBlank(node.TBlank)
	 */
	@Override
	public void caseTBlank(TBlank node) {
		// TODO Auto-generated method stub
		super.caseTBlank(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTDash(node.TDash)
	 */
	@Override
	public void caseTDash(TDash node) {
		// TODO Auto-generated method stub
		super.caseTDash(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTAmpersand(node.TAmpersand)
	 */
	@Override
	public void caseTAmpersand(TAmpersand node) {
		// TODO Auto-generated method stub
		super.caseTAmpersand(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTSlash(node.TSlash)
	 */
	@Override
	public void caseTSlash(TSlash node) {
		// TODO Auto-generated method stub
		super.caseTSlash(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTQuestion(node.TQuestion)
	 */
	@Override
	public void caseTQuestion(TQuestion node) {
		// TODO Auto-generated method stub
		super.caseTQuestion(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTExclamation(node.TExclamation)
	 */
	@Override
	public void caseTExclamation(TExclamation node) {
		// TODO Auto-generated method stub
		super.caseTExclamation(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTAt(node.TAt)
	 */
	@Override
	public void caseTAt(TAt node) {
		// TODO Auto-generated method stub
		super.caseTAt(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTTilde(node.TTilde)
	 */
	@Override
	public void caseTTilde(TTilde node) {
		// TODO Auto-generated method stub
		super.caseTTilde(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTSection(node.TSection)
	 */
	@Override
	public void caseTSection(TSection node) {
		// TODO Auto-generated method stub
		super.caseTSection(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTUnderscore(node.TUnderscore)
	 */
	@Override
	public void caseTUnderscore(TUnderscore node) {
		// TODO Auto-generated method stub
		super.caseTUnderscore(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTPipe(node.TPipe)
	 */
	@Override
	public void caseTPipe(TPipe node) {
		// TODO Auto-generated method stub
		super.caseTPipe(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTHash(node.THash)
	 */
	@Override
	public void caseTHash(THash node) {
		// TODO Auto-generated method stub
		super.caseTHash(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTCaret(node.TCaret)
	 */
	@Override
	public void caseTCaret(TCaret node) {
		// TODO Auto-generated method stub
		super.caseTCaret(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTDegree(node.TDegree)
	 */
	@Override
	public void caseTDegree(TDegree node) {
		// TODO Auto-generated method stub
		super.caseTDegree(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTBlackslash(node.TBlackslash)
	 */
	@Override
	public void caseTBlackslash(TBlackslash node) {
		// TODO Auto-generated method stub
		super.caseTBlackslash(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTEquals(node.TEquals)
	 */
	@Override
	public void caseTEquals(TEquals node) {
		// TODO Auto-generated method stub
		super.caseTEquals(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTQuote(node.TQuote)
	 */
	@Override
	public void caseTQuote(TQuote node) {
		// TODO Auto-generated method stub
		super.caseTQuote(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTReturn(node.TReturn)
	 */
	@Override
	public void caseTReturn(TReturn node) {
		// TODO Auto-generated method stub
		super.caseTReturn(node);
	}

	/* (non-Javadoc)
	 * @see analysis.AnalysisAdapter#caseTComment(node.TComment)
	 */
	@Override
	public void caseTComment(TComment node) {
		// TODO Auto-generated method stub
		super.caseTComment(node);
	}

	
	
	
	
}
