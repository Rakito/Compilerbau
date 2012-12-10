/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANilConst extends PConst
{
    private TCons _cons_;
    private TId _consName_;
    private TLPar _lPar_;
    private TRPar _rPar_;

    public ANilConst()
    {
    	System.out.println("OLAF!!!");
        // Constructor
    }

    public ANilConst(
        @SuppressWarnings("hiding") TCons _cons_,
        @SuppressWarnings("hiding") TId _consName_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setCons(_cons_);

        setConsName(_consName_);

        setLPar(_lPar_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new ANilConst(
            cloneNode(this._cons_),
            cloneNode(this._consName_),
            cloneNode(this._lPar_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANilConst(this);
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

    public TId getConsName()
    {
        return this._consName_;
    }

    public void setConsName(TId node)
    {
        if(this._consName_ != null)
        {
            this._consName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._consName_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._cons_)
            + toString(this._consName_)
            + toString(this._lPar_)
            + toString(this._rPar_);
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

        if(this._consName_ == child)
        {
            this._consName_ = null;
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

        if(this._consName_ == oldChild)
        {
            setConsName((TId) newChild);
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

        throw new RuntimeException("Not a child.");
    }
}
