/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAnotherParam extends PParam
{
    private PType _type_;
    private TId _id_;
    private TComma _comma_;
    private PParam _param_;

    public AAnotherParam()
    {
        // Constructor
    }

    public AAnotherParam(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PParam _param_)
    {
        // Constructor
        setType(_type_);

        setId(_id_);

        setComma(_comma_);

        setParam(_param_);

    }

    @Override
    public Object clone()
    {
        return new AAnotherParam(
            cloneNode(this._type_),
            cloneNode(this._id_),
            cloneNode(this._comma_),
            cloneNode(this._param_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnotherParam(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public PParam getParam()
    {
        return this._param_;
    }

    public void setParam(PParam node)
    {
        if(this._param_ != null)
        {
            this._param_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._param_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._id_)
            + toString(this._comma_)
            + toString(this._param_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._param_ == child)
        {
            this._param_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._param_ == oldChild)
        {
            setParam((PParam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
