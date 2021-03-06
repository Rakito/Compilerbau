/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAnotherFuncPara extends PFuncPara
{
    private PTerm _term_;
    private TComma _comma_;
    private PFuncPara _funcPara_;

    public AAnotherFuncPara()
    {
        // Constructor
    }

    public AAnotherFuncPara(
        @SuppressWarnings("hiding") PTerm _term_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PFuncPara _funcPara_)
    {
        // Constructor
        setTerm(_term_);

        setComma(_comma_);

        setFuncPara(_funcPara_);

    }

    @Override
    public Object clone()
    {
        return new AAnotherFuncPara(
            cloneNode(this._term_),
            cloneNode(this._comma_),
            cloneNode(this._funcPara_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnotherFuncPara(this);
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PFuncPara getFuncPara()
    {
        return this._funcPara_;
    }

    public void setFuncPara(PFuncPara node)
    {
        if(this._funcPara_ != null)
        {
            this._funcPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcPara_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._term_)
            + toString(this._comma_)
            + toString(this._funcPara_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._funcPara_ == child)
        {
            this._funcPara_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._funcPara_ == oldChild)
        {
            setFuncPara((PFuncPara) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
