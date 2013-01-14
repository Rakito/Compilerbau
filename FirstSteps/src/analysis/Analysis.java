/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAEofProgram(AEofProgram node);
    void caseADefineProgram(ADefineProgram node);
    void caseAFunctionProgram(AFunctionProgram node);
    void caseADefineDefine(ADefineDefine node);
    void caseAFunctionDefine(AFunctionDefine node);
    void caseAConsDefine(AConsDefine node);
    void caseANilDefine(ANilDefine node);
    void caseAExprImpl(AExprImpl node);
    void caseAImplexprImpl(AImplexprImpl node);
    void caseAEndExpr(AEndExpr node);
    void caseATermExpr(ATermExpr node);
    void caseAFunctionExpr(AFunctionExpr node);
    void caseAPlusExpr(APlusExpr node);
    void caseAMinusExpr(AMinusExpr node);
    void caseAMultExpr(AMultExpr node);
    void caseADivExpr(ADivExpr node);
    void caseAModExpr(AModExpr node);
    void caseAIfExpr(AIfExpr node);
    void caseAConcatExpr(AConcatExpr node);
    void caseAFuncCallFunction(AFuncCallFunction node);
    void caseAIdTerm(AIdTerm node);
    void caseANumberTerm(ANumberTerm node);
    void caseANullTerm(ANullTerm node);
    void caseAExprTerm(AExprTerm node);

    void caseTDefine(TDefine node);
    void caseTFunc(TFunc node);
    void caseTBegin(TBegin node);
    void caseTEnd(TEnd node);
    void caseTCons(TCons node);
    void caseTWhere(TWhere node);
    void caseTBreak(TBreak node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTReturnt(TReturnt node);
    void caseTNull(TNull node);
    void caseTId(TId node);
    void caseTNumber(TNumber node);
    void caseTPlus(TPlus node);
    void caseTHyphen(THyphen node);
    void caseTAsterisk(TAsterisk node);
    void caseTPercent(TPercent node);
    void caseTDot(TDot node);
    void caseTComma(TComma node);
    void caseTQuery(TQuery node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTLBox(TLBox node);
    void caseTRBox(TRBox node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTLArrow(TLArrow node);
    void caseTRArrow(TRArrow node);
    void caseTBlank(TBlank node);
    void caseTDash(TDash node);
    void caseTAmpersand(TAmpersand node);
    void caseTSlash(TSlash node);
    void caseTQuestion(TQuestion node);
    void caseTExclamation(TExclamation node);
    void caseTAt(TAt node);
    void caseTTilde(TTilde node);
    void caseTSection(TSection node);
    void caseTUnderscore(TUnderscore node);
    void caseTPipe(TPipe node);
    void caseTHash(THash node);
    void caseTCaret(TCaret node);
    void caseTDegree(TDegree node);
    void caseTBlackslash(TBlackslash node);
    void caseTEquals(TEquals node);
    void caseTQuote(TQuote node);
    void caseTReturn(TReturn node);
    void caseTTab(TTab node);
    void caseTComment(TComment node);
    void caseTEndoffile(TEndoffile node);
    void caseEOF(EOF node);
}
