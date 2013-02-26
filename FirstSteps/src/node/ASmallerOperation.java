/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASmallerOperation extends POperation
{
    private PTerm _left_;
    private TSmaller _smaller_;
    private PExpr _right_;

    public ASmallerOperation()
    {
        // Constructor
    }

    public ASmallerOperation(
        @SuppressWarnings("hiding") PTerm _left_,
        @SuppressWarnings("hiding") TSmaller _smaller_,
        @SuppressWarnings("hiding") PExpr _right_)
    {
        // Constructor
        setLeft(_left_);

        setSmaller(_smaller_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ASmallerOperation(
            cloneNode(this._left_),
            cloneNode(this._smaller_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASmallerOperation(this);
    }

    public PTerm getLeft()
    {
        return this._left_;
    }

    public void setLeft(PTerm node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TSmaller getSmaller()
    {
        return this._smaller_;
    }

    public void setSmaller(TSmaller node)
    {
        if(this._smaller_ != null)
        {
            this._smaller_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._smaller_ = node;
    }

    public PExpr getRight()
    {
        return this._right_;
    }

    public void setRight(PExpr node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._smaller_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._smaller_ == child)
        {
            this._smaller_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PTerm) newChild);
            return;
        }

        if(this._smaller_ == oldChild)
        {
            setSmaller((TSmaller) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}