/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AVoidType extends PType
{
    private TLArrow _lArrow_;
    private TVoid _void_;
    private TRArrow _rArrow_;

    public AVoidType()
    {
        // Constructor
    }

    public AVoidType(
        @SuppressWarnings("hiding") TLArrow _lArrow_,
        @SuppressWarnings("hiding") TVoid _void_,
        @SuppressWarnings("hiding") TRArrow _rArrow_)
    {
        // Constructor
        setLArrow(_lArrow_);

        setVoid(_void_);

        setRArrow(_rArrow_);

    }

    @Override
    public Object clone()
    {
        return new AVoidType(
            cloneNode(this._lArrow_),
            cloneNode(this._void_),
            cloneNode(this._rArrow_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVoidType(this);
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

    public TVoid getVoid()
    {
        return this._void_;
    }

    public void setVoid(TVoid node)
    {
        if(this._void_ != null)
        {
            this._void_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._void_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._lArrow_)
            + toString(this._void_)
            + toString(this._rArrow_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lArrow_ == child)
        {
            this._lArrow_ = null;
            return;
        }

        if(this._void_ == child)
        {
            this._void_ = null;
            return;
        }

        if(this._rArrow_ == child)
        {
            this._rArrow_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lArrow_ == oldChild)
        {
            setLArrow((TLArrow) newChild);
            return;
        }

        if(this._void_ == oldChild)
        {
            setVoid((TVoid) newChild);
            return;
        }

        if(this._rArrow_ == oldChild)
        {
            setRArrow((TRArrow) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
