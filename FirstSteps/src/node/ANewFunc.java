/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANewFunc extends PFunc
{
    private TNew _new_;
    private TId _id_;
    private TLPar _lPar_;
    private PFuncPara _funcPara_;

    public ANewFunc()
    {
        // Constructor
    }

    public ANewFunc(
        @SuppressWarnings("hiding") TNew _new_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PFuncPara _funcPara_)
    {
        // Constructor
        setNew(_new_);

        setId(_id_);

        setLPar(_lPar_);

        setFuncPara(_funcPara_);

    }

    @Override
    public Object clone()
    {
        return new ANewFunc(
            cloneNode(this._new_),
            cloneNode(this._id_),
            cloneNode(this._lPar_),
            cloneNode(this._funcPara_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewFunc(this);
    }

    public TNew getNew()
    {
        return this._new_;
    }

    public void setNew(TNew node)
    {
        if(this._new_ != null)
        {
            this._new_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._new_ = node;
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
            + toString(this._new_)
            + toString(this._id_)
            + toString(this._lPar_)
            + toString(this._funcPara_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._new_ == child)
        {
            this._new_ = null;
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
        if(this._new_ == oldChild)
        {
            setNew((TNew) newChild);
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

        if(this._funcPara_ == oldChild)
        {
            setFuncPara((PFuncPara) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
