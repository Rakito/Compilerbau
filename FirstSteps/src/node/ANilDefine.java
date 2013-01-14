/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANilDefine extends PDefine
{
    private TCons _cons_;
    private TId _id_;
    private TLPar _lPar_;
    private TRPar _rPar_;
    private PImpl _impl_;

    public ANilDefine()
    {
        // Constructor
    }

    public ANilDefine(
        @SuppressWarnings("hiding") TCons _cons_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PImpl _impl_)
    {
        // Constructor
        setCons(_cons_);

        setId(_id_);

        setLPar(_lPar_);

        setRPar(_rPar_);

        setImpl(_impl_);

    }

    @Override
    public Object clone()
    {
        return new ANilDefine(
            cloneNode(this._cons_),
            cloneNode(this._id_),
            cloneNode(this._lPar_),
            cloneNode(this._rPar_),
            cloneNode(this._impl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANilDefine(this);
    }

    public TCons getCons()
    {
        return this._cons_;
    }

    public void setCons(TCons node)
    {
        if(this._cons_ != null)
        {
            this._cons_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cons_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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
            + toString(this._cons_)
            + toString(this._id_)
            + toString(this._lPar_)
            + toString(this._rPar_)
            + toString(this._impl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cons_ == child)
        {
            this._cons_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
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
        if(this._cons_ == oldChild)
        {
            setCons((TCons) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
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