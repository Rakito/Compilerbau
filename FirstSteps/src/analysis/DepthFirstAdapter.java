/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPIfex().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAIfex(AIfex node)
    {
        defaultIn(node);
    }

    public void outAIfex(AIfex node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfex(AIfex node)
    {
        inAIfex(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getQuery() != null)
        {
            node.getQuery().apply(this);
        }
        if(node.getMiddle() != null)
        {
            node.getMiddle().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAIfex(node);
    }

    public void inAFactorExpr(AFactorExpr node)
    {
        defaultIn(node);
    }

    public void outAFactorExpr(AFactorExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        inAFactorExpr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactorExpr(node);
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
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
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
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAMinusExpr(node);
    }

    public void inATermFactor(ATermFactor node)
    {
        defaultIn(node);
    }

    public void outATermFactor(ATermFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        inATermFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermFactor(node);
    }

    public void inAMultFactor(AMultFactor node)
    {
        defaultIn(node);
    }

    public void outAMultFactor(AMultFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultFactor(AMultFactor node)
    {
        inAMultFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAMultFactor(node);
    }

    public void inADivFactor(ADivFactor node)
    {
        defaultIn(node);
    }

    public void outADivFactor(ADivFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivFactor(ADivFactor node)
    {
        inADivFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outADivFactor(node);
    }

    public void inAModFactor(AModFactor node)
    {
        defaultIn(node);
    }

    public void outAModFactor(AModFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModFactor(AModFactor node)
    {
        inAModFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAModFactor(node);
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
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAExprTerm(node);
    }
}
