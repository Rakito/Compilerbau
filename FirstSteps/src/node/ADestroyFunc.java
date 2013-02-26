/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADestroyFunc extends PFunc
{
    private TDestroy _destroy_;
    private TId _id_;

    public ADestroyFunc()
    {
        // Constructor
    }

    public ADestroyFunc(
        @SuppressWarnings("hiding") TDestroy _destroy_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setDestroy(_destroy_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new ADestroyFunc(
            cloneNode(this._destroy_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADestroyFunc(this);
    }

    public TDestroy getDestroy()
    {
        return this._destroy_;
    }

    public void setDestroy(TDestroy node)
    {
        if(this._destroy_ != null)
        {
            this._destroy_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._destroy_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._destroy_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._destroy_ == child)
        {
            this._destroy_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._destroy_ == oldChild)
        {
            setDestroy((TDestroy) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}