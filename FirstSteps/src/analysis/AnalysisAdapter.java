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
    public void caseAParaParas(AParaParas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParasParas(AParasParas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfex(AIfex node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionExpr(AFunctionExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstructorExpr(AConstructorExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusExpr(APlusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionFunction(AFunctionFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConsConst(AConsConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANilConst(ANilConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFactor(AMultFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivFactor(ADivFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModFactor(AModFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberTerm(ANumberTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprTerm(AExprTerm node)
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
    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalse(TFalse node)
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
    public void caseTHyphen(THyphen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsterisk(TAsterisk node)
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
    public void caseTDash(TDash node)
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
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
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
