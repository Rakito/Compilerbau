/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAEofProgram(AEofProgram node)
    {
        defaultIn(node);
    }

    public void outAEofProgram(AEofProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEofProgram(AEofProgram node)
    {
        inAEofProgram(node);
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        outAEofProgram(node);
    }

    public void inAFunctionProgram(AFunctionProgram node)
    {
        defaultIn(node);
    }

    public void outAFunctionProgram(AFunctionProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionProgram(AFunctionProgram node)
    {
        inAFunctionProgram(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFunctionProgram(node);
    }

    public void inADefineProgram(ADefineProgram node)
    {
        defaultIn(node);
    }

    public void outADefineProgram(ADefineProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineProgram(ADefineProgram node)
    {
        inADefineProgram(node);
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        outADefineProgram(node);
    }

    public void inADefineDefine(ADefineDefine node)
    {
        defaultIn(node);
    }

    public void outADefineDefine(ADefineDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineDefine(ADefineDefine node)
    {
        inADefineDefine(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getEquals() != null)
        {
            node.getEquals().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        outADefineDefine(node);
    }

    public void inAFunctionDefine(AFunctionDefine node)
    {
        defaultIn(node);
    }

    public void outAFunctionDefine(AFunctionDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDefine(AFunctionDefine node)
    {
        inAFunctionDefine(node);
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getRArrow() != null)
        {
            node.getRArrow().apply(this);
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getFunc() != null)
        {
            node.getFunc().apply(this);
        }
        outAFunctionDefine(node);
    }

    public void inAConsDefine(AConsDefine node)
    {
        defaultIn(node);
    }

    public void outAConsDefine(AConsDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConsDefine(AConsDefine node)
    {
        inAConsDefine(node);
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCons() != null)
        {
            node.getCons().apply(this);
        }
        outAConsDefine(node);
    }

    public void inANilDefine(ANilDefine node)
    {
        defaultIn(node);
    }

    public void outANilDefine(ANilDefine node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANilDefine(ANilDefine node)
    {
        inANilDefine(node);
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCons() != null)
        {
            node.getCons().apply(this);
        }
        outANilDefine(node);
    }

    public void inAEndImpl(AEndImpl node)
    {
        defaultIn(node);
    }

    public void outAEndImpl(AEndImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndImpl(AEndImpl node)
    {
        inAEndImpl(node);
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAEndImpl(node);
    }

    public void inAReturnImpl(AReturnImpl node)
    {
        defaultIn(node);
    }

    public void outAReturnImpl(AReturnImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnImpl(AReturnImpl node)
    {
        inAReturnImpl(node);
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getReturnt() != null)
        {
            node.getReturnt().apply(this);
        }
        outAReturnImpl(node);
    }

    public void inAExprImpl(AExprImpl node)
    {
        defaultIn(node);
    }

    public void outAExprImpl(AExprImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprImpl(AExprImpl node)
    {
        inAExprImpl(node);
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAExprImpl(node);
    }

    public void inADefineImpl(ADefineImpl node)
    {
        defaultIn(node);
    }

    public void outADefineImpl(ADefineImpl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefineImpl(ADefineImpl node)
    {
        inADefineImpl(node);
        if(node.getImpl() != null)
        {
            node.getImpl().apply(this);
        }
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        outADefineImpl(node);
    }

    public void inAEndExpr(AEndExpr node)
    {
        defaultIn(node);
    }

    public void outAEndExpr(AEndExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndExpr(AEndExpr node)
    {
        inAEndExpr(node);
        if(node.getHash() != null)
        {
            node.getHash().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAEndExpr(node);
    }

    public void inATermExpr(ATermExpr node)
    {
        defaultIn(node);
    }

    public void outATermExpr(ATermExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermExpr(ATermExpr node)
    {
        inATermExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermExpr(node);
    }

    public void inAFunctionExpr(AFunctionExpr node)
    {
        defaultIn(node);
    }

    public void outAFunctionExpr(AFunctionExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionExpr(AFunctionExpr node)
    {
        inAFunctionExpr(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFunctionExpr(node);
    }

    public void inAPlusExpr(APlusExpr node)
    {
        defaultIn(node);
    }

    public void outAPlusExpr(APlusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpr(APlusExpr node)
    {
        inAPlusExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPlusExpr(node);
    }

    public void inAMinusExpr(AMinusExpr node)
    {
        defaultIn(node);
    }

    public void outAMinusExpr(AMinusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        inAMinusExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getDash() != null)
        {
            node.getDash().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAMinusExpr(node);
    }

    public void inAMultExpr(AMultExpr node)
    {
        defaultIn(node);
    }

    public void outAMultExpr(AMultExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpr(AMultExpr node)
    {
        inAMultExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getAsterisk() != null)
        {
            node.getAsterisk().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAMultExpr(node);
    }

    public void inADivExpr(ADivExpr node)
    {
        defaultIn(node);
    }

    public void outADivExpr(ADivExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpr(ADivExpr node)
    {
        inADivExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outADivExpr(node);
    }

    public void inAModExpr(AModExpr node)
    {
        defaultIn(node);
    }

    public void outAModExpr(AModExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExpr(AModExpr node)
    {
        inAModExpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getPercent() != null)
        {
            node.getPercent().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAModExpr(node);
    }

    public void inAIfExpr(AIfExpr node)
    {
        defaultIn(node);
    }

    public void outAIfExpr(AIfExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfExpr(AIfExpr node)
    {
        inAIfExpr(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getElsein() != null)
        {
            node.getElsein().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getThenin() != null)
        {
            node.getThenin().apply(this);
        }
        if(node.getQuery() != null)
        {
            node.getQuery().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        outAIfExpr(node);
    }

    public void inAConcatExpr(AConcatExpr node)
    {
        defaultIn(node);
    }

    public void outAConcatExpr(AConcatExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConcatExpr(AConcatExpr node)
    {
        inAConcatExpr(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAConcatExpr(node);
    }

    public void inAFuncCallFunction(AFuncCallFunction node)
    {
        defaultIn(node);
    }

    public void outAFuncCallFunction(AFuncCallFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncCallFunction(AFuncCallFunction node)
    {
        inAFuncCallFunction(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCall() != null)
        {
            node.getCall().apply(this);
        }
        outAFuncCallFunction(node);
    }

    public void inAIdTerm(AIdTerm node)
    {
        defaultIn(node);
    }

    public void outAIdTerm(AIdTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        inAIdTerm(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdTerm(node);
    }

    public void inANumberTerm(ANumberTerm node)
    {
        defaultIn(node);
    }

    public void outANumberTerm(ANumberTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberTerm(ANumberTerm node)
    {
        inANumberTerm(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberTerm(node);
    }

    public void inANullTerm(ANullTerm node)
    {
        defaultIn(node);
    }

    public void outANullTerm(ANullTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANullTerm(ANullTerm node)
    {
        inANullTerm(node);
        if(node.getNull() != null)
        {
            node.getNull().apply(this);
        }
        outANullTerm(node);
    }

    public void inABoolTerm(ABoolTerm node)
    {
        defaultIn(node);
    }

    public void outABoolTerm(ABoolTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolTerm(ABoolTerm node)
    {
        inABoolTerm(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolTerm(node);
    }

    public void inAExprTerm(AExprTerm node)
    {
        defaultIn(node);
    }

    public void outAExprTerm(AExprTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprTerm(AExprTerm node)
    {
        inAExprTerm(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAExprTerm(node);
    }
}
