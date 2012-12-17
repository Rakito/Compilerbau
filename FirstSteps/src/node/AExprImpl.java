/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExprImpl extends PImpl
{
    private TLBrace _lBrace_;
    private PExpr _impl_;
    private TReturn _return_;
    private PExpr _returnex_;
    private TRBrace _rBrace_;

    public AExprImpl()
    {
        // Constructor
    }

    public AExprImpl(
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") PExpr _impl_,
        @SuppressWarnings("hiding") TReturn _return_,
        @SuppressWarnings("hiding") PExpr _returnex_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setLBrace(_lBrace_);

        setImpl(_impl_);

        setReturn(_return_);

        setReturnex(_returnex_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AExprImpl(
            cloneNode(this._lBrace_),
            cloneNode(this._impl_),
            cloneNode(this._return_),
            cloneNode(this._returnex_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprImpl(this);
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public PExpr getImpl()
    {
        return this._impl_;
    }

    public void setImpl(PExpr node)
    {
        if(this._impl_ != null)
        {
            this._impl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._impl_ = node;
    }

    public TReturn getReturn()
    {
        return this._return_;
    }

    public void setReturn(TReturn node)
    {
        if(this._return_ != null)
        {
            this._return_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._return_ = node;
    }

    public PExpr getReturnex()
    {
        return this._returnex_;
    }

    public void setReturnex(PExpr node)
    {
        if(this._returnex_ != null)
        {
            this._returnex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._returnex_ = node;
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrace_)
            + toString(this._impl_)
            + toString(this._return_)
            + toString(this._returnex_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._impl_ == child)
        {
            this._impl_ = null;
            return;
        }

        if(this._return_ == child)
        {
            this._return_ = null;
            return;
        }

        if(this._returnex_ == child)
        {
            this._returnex_ = null;
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(this._impl_ == oldChild)
        {
            setImpl((PExpr) newChild);
            return;
        }

        if(this._return_ == oldChild)
        {
            setReturn((TReturn) newChild);
            return;
        }

        if(this._returnex_ == oldChild)
        {
            setReturnex((PExpr) newChild);
            return;
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
