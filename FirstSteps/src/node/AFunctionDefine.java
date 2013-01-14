/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDefine extends PDefine
{
    private TFunc _func_;
    private TLArrow _lArrow_;
    private TId _return_;
    private TRArrow _rArrow_;
    private TId _name_;
    private TLPar _lPar_;
    private PTerm _term_;
    private TRPar _rPar_;
    private PImpl _impl_;

    public AFunctionDefine()
    {
        // Constructor
    }

    public AFunctionDefine(
        @SuppressWarnings("hiding") TFunc _func_,
        @SuppressWarnings("hiding") TLArrow _lArrow_,
        @SuppressWarnings("hiding") TId _return_,
        @SuppressWarnings("hiding") TRArrow _rArrow_,
        @SuppressWarnings("hiding") TId _name_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PTerm _term_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PImpl _impl_)
    {
        // Constructor
        setFunc(_func_);

        setLArrow(_lArrow_);

        setReturn(_return_);

        setRArrow(_rArrow_);

        setName(_name_);

        setLPar(_lPar_);

        setTerm(_term_);

        setRPar(_rPar_);

        setImpl(_impl_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDefine(
            cloneNode(this._func_),
            cloneNode(this._lArrow_),
            cloneNode(this._return_),
            cloneNode(this._rArrow_),
            cloneNode(this._name_),
            cloneNode(this._lPar_),
            cloneNode(this._term_),
            cloneNode(this._rPar_),
            cloneNode(this._impl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDefine(this);
    }

    public TFunc getFunc()
    {
        return this._func_;
    }

    public void setFunc(TFunc node)
    {
        if(this._func_ != null)
        {
            this._func_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._func_ = node;
    }

    public TLArrow getLArrow()
    {
        return this._lArrow_;
    }

    public void setLArrow(TLArrow node)
    {
        if(this._lArrow_ != null)
        {
            this._lArrow_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lArrow_ = node;
    }

    public TId getReturn()
    {
        return this._return_;
    }

    public void setReturn(TId node)
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

    public TRArrow getRArrow()
    {
        return this._rArrow_;
    }

    public void setRArrow(TRArrow node)
    {
        if(this._rArrow_ != null)
        {
            this._rArrow_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rArrow_ = node;
    }

    public TId getName()
    {
        return this._name_;
    }

    public void setName(TId node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public PImpl getImpl()
    {
        return this._impl_;
    }

    public void setImpl(PImpl node)
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._func_)
            + toString(this._lArrow_)
            + toString(this._return_)
            + toString(this._rArrow_)
            + toString(this._name_)
            + toString(this._lPar_)
            + toString(this._term_)
            + toString(this._rPar_)
            + toString(this._impl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._func_ == child)
        {
            this._func_ = null;
            return;
        }

        if(this._lArrow_ == child)
        {
            this._lArrow_ = null;
            return;
        }

        if(this._return_ == child)
        {
            this._return_ = null;
            return;
        }

        if(this._rArrow_ == child)
        {
            this._rArrow_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._impl_ == child)
        {
            this._impl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._func_ == oldChild)
        {
            setFunc((TFunc) newChild);
            return;
        }

        if(this._lArrow_ == oldChild)
        {
            setLArrow((TLArrow) newChild);
            return;
        }

        if(this._return_ == oldChild)
        {
            setReturn((TId) newChild);
            return;
        }

        if(this._rArrow_ == oldChild)
        {
            setRArrow((TRArrow) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TId) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._impl_ == oldChild)
        {
            setImpl((PImpl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}