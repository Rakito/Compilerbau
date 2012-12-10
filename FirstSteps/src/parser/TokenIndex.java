/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import node.*;
import analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTDefine(@SuppressWarnings("unused") TDefine node)
    {
        this.index = 0;
    }

    @Override
    public void caseTFunc(@SuppressWarnings("unused") TFunc node)
    {
        this.index = 1;
    }

    @Override
    public void caseTBegin(@SuppressWarnings("unused") TBegin node)
    {
        this.index = 2;
    }

    @Override
    public void caseTEnd(@SuppressWarnings("unused") TEnd node)
    {
        this.index = 3;
    }

    @Override
    public void caseTCons(@SuppressWarnings("unused") TCons node)
    {
        this.index = 4;
    }

    @Override
    public void caseTWhere(@SuppressWarnings("unused") TWhere node)
    {
        this.index = 5;
    }

    @Override
    public void caseTBreak(@SuppressWarnings("unused") TBreak node)
    {
        this.index = 6;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 7;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 8;
    }

    @Override
    public void caseTReturnt(@SuppressWarnings("unused") TReturnt node)
    {
        this.index = 9;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 10;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 11;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 12;
    }

    @Override
    public void caseTHyphen(@SuppressWarnings("unused") THyphen node)
    {
        this.index = 13;
    }

    @Override
    public void caseTAsterisk(@SuppressWarnings("unused") TAsterisk node)
    {
        this.index = 14;
    }

    @Override
    public void caseTPercent(@SuppressWarnings("unused") TPercent node)
    {
        this.index = 15;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 16;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 17;
    }

    @Override
    public void caseTQuery(@SuppressWarnings("unused") TQuery node)
    {
        this.index = 18;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 19;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 20;
    }

    @Override
    public void caseTLBox(@SuppressWarnings("unused") TLBox node)
    {
        this.index = 21;
    }

    @Override
    public void caseTRBox(@SuppressWarnings("unused") TRBox node)
    {
        this.index = 22;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 23;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 24;
    }

    @Override
    public void caseTLBrace(@SuppressWarnings("unused") TLBrace node)
    {
        this.index = 25;
    }

    @Override
    public void caseTRBrace(@SuppressWarnings("unused") TRBrace node)
    {
        this.index = 26;
    }

    @Override
    public void caseTLArrow(@SuppressWarnings("unused") TLArrow node)
    {
        this.index = 27;
    }

    @Override
    public void caseTRArrow(@SuppressWarnings("unused") TRArrow node)
    {
        this.index = 28;
    }

    @Override
    public void caseTDash(@SuppressWarnings("unused") TDash node)
    {
        this.index = 29;
    }

    @Override
    public void caseTAmpersand(@SuppressWarnings("unused") TAmpersand node)
    {
        this.index = 30;
    }

    @Override
    public void caseTSlash(@SuppressWarnings("unused") TSlash node)
    {
        this.index = 31;
    }

    @Override
    public void caseTQuestion(@SuppressWarnings("unused") TQuestion node)
    {
        this.index = 32;
    }

    @Override
    public void caseTExclamation(@SuppressWarnings("unused") TExclamation node)
    {
        this.index = 33;
    }

    @Override
    public void caseTAt(@SuppressWarnings("unused") TAt node)
    {
        this.index = 34;
    }

    @Override
    public void caseTTilde(@SuppressWarnings("unused") TTilde node)
    {
        this.index = 35;
    }

    @Override
    public void caseTSection(@SuppressWarnings("unused") TSection node)
    {
        this.index = 36;
    }

    @Override
    public void caseTUnderscore(@SuppressWarnings("unused") TUnderscore node)
    {
        this.index = 37;
    }

    @Override
    public void caseTPipe(@SuppressWarnings("unused") TPipe node)
    {
        this.index = 38;
    }

    @Override
    public void caseTHash(@SuppressWarnings("unused") THash node)
    {
        this.index = 39;
    }

    @Override
    public void caseTCaret(@SuppressWarnings("unused") TCaret node)
    {
        this.index = 40;
    }

    @Override
    public void caseTDegree(@SuppressWarnings("unused") TDegree node)
    {
        this.index = 41;
    }

    @Override
    public void caseTBlackslash(@SuppressWarnings("unused") TBlackslash node)
    {
        this.index = 42;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 43;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 44;
    }
}
