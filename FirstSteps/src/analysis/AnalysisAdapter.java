/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEofProgram(AEofProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIncludeProgram(AIncludeProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefineProgram(ADefineProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructProgram(AStructProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionProgram(AFunctionProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDefine(AVarDefine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarSetDefine(AVarSetDefine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructStruct(AStructStruct node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEndStructBody(AEndStructBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefineStructBody(ADefineStructBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstructorStructBody(AConstructorStructBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConsConstructor(AConsConstructor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionFunction(AFunctionFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEndParam(AEndParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOneParam(AOneParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAnotherParam(AAnotherParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEndImpl(AEndImpl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnImpl(AReturnImpl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprImpl(AExprImpl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefineImpl(ADefineImpl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperationExpr(AOperationExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncExpr(AFuncExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicExpr(ALogicExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermExpr(ATermExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASetExpr(ASetExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASetSet(ASetSet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncFunc(AFuncFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANewFunc(ANewFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADestroyFunc(ADestroyFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEndFuncPara(AEndFuncPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOneFuncPara(AOneFuncPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAnotherFuncPara(AAnotherFuncPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfLogic(AIfLogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfelseLogic(AIfelseLogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileLogic(AWhileLogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASameOperation(ASameOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusOperation(APlusOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASmallerOperation(ASmallerOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABiggerOperation(ABiggerOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusOperation(AMinusOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultOperation(AMultOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivOperation(ADivOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModOperation(AModOperation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprTerm(AExprTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberTerm(ANumberTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANullTerm(ANullTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTerm(ABoolTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypeType(ATypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDefine(TDefine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFunc(TFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBegin(TBegin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCons(TCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhere(TWhere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBreak(TBreak node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturnt(TReturnt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInclude(TInclude node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIs(TIs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCall(TCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStruct(TStruct node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDestroy(TDestroy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSmaller(TSmaller node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBigger(TBigger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTimes(TTimes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPercent(TPercent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuery(TQuery node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBox(TLBox node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBox(TRBox node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLArrow(TLArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRArrow(TRArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAmpersand(TAmpersand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuestion(TQuestion node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExclamation(TExclamation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAt(TAt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTilde(TTilde node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSection(TSection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUnderscore(TUnderscore node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPipe(TPipe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHash(THash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaret(TCaret node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDegree(TDegree node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlackslash(TBlackslash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCcode(TCcode node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndoffile(TEndoffile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
