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
    void caseAIncludeProgram(AIncludeProgram node);
    void caseADefineProgram(ADefineProgram node);
    void caseAStructProgram(AStructProgram node);
    void caseAFunctionProgram(AFunctionProgram node);
    void caseAVarDefine(AVarDefine node);
    void caseAVarSetDefine(AVarSetDefine node);
    void caseAStructStruct(AStructStruct node);
    void caseAEndStructBody(AEndStructBody node);
    void caseADefineStructBody(ADefineStructBody node);
    void caseAConstructorStructBody(AConstructorStructBody node);
    void caseAConsConstructor(AConsConstructor node);
    void caseAFunctionFunction(AFunctionFunction node);
    void caseAEndParam(AEndParam node);
    void caseAOneParam(AOneParam node);
    void caseAAnotherParam(AAnotherParam node);
    void caseAEndImpl(AEndImpl node);
    void caseAReturnImpl(AReturnImpl node);
    void caseAPrintImpl(APrintImpl node);
    void caseAExprImpl(AExprImpl node);
    void caseADefineImpl(ADefineImpl node);
    void caseAOperationExpr(AOperationExpr node);
    void caseAFuncExpr(AFuncExpr node);
    void caseALogicExpr(ALogicExpr node);
    void caseATermExpr(ATermExpr node);
    void caseASetExpr(ASetExpr node);
    void caseASetSet(ASetSet node);
    void caseAFuncFunc(AFuncFunc node);
    void caseANewFunc(ANewFunc node);
    void caseADestroyFunc(ADestroyFunc node);
    void caseAEndFuncPara(AEndFuncPara node);
    void caseAOneFuncPara(AOneFuncPara node);
    void caseAAnotherFuncPara(AAnotherFuncPara node);
    void caseAIfLogic(AIfLogic node);
    void caseAIfelseLogic(AIfelseLogic node);
    void caseAWhileLogic(AWhileLogic node);
    void caseASameOperation(ASameOperation node);
    void caseAPlusOperation(APlusOperation node);
    void caseASmallerOperation(ASmallerOperation node);
    void caseABiggerOperation(ABiggerOperation node);
    void caseAMinusOperation(AMinusOperation node);
    void caseAMultOperation(AMultOperation node);
    void caseADivOperation(ADivOperation node);
    void caseAModOperation(AModOperation node);
    void caseAExprTerm(AExprTerm node);
    void caseAIdTerm(AIdTerm node);
    void caseANumberTerm(ANumberTerm node);
    void caseANullTerm(ANullTerm node);
    void caseABoolTerm(ABoolTerm node);
    void caseAVoidType(AVoidType node);
    void caseATypeType(ATypeType node);

    void caseTDefine(TDefine node);
    void caseTFunc(TFunc node);
    void caseTBegin(TBegin node);
    void caseTEnd(TEnd node);
    void caseTCons(TCons node);
    void caseTWhere(TWhere node);
    void caseTBreak(TBreak node);
    void caseTReturnt(TReturnt node);
    void caseTNull(TNull node);
    void caseTInclude(TInclude node);
    void caseTVoid(TVoid node);
    void caseTIs(TIs node);
    void caseTCall(TCall node);
    void caseTBool(TBool node);
    void caseTStruct(TStruct node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTFor(TFor node);
    void caseTForeach(TForeach node);
    void caseTIn(TIn node);
    void caseTNew(TNew node);
    void caseTDestroy(TDestroy node);
    void caseTSmaller(TSmaller node);
    void caseTBigger(TBigger node);
    void caseTId(TId node);
    void caseTNumber(TNumber node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTStar(TStar node);
    void caseTTimes(TTimes node);
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
    void caseTEndoffile(TEndoffile node);
    void caseEOF(EOF node);
}
