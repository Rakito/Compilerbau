/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADefImpl extends PImpl
{
    private PDef _def_;

    public ADefImpl()
    {
        // Constructor
    }

    public ADefImpl(
        @SuppressWarnings("hiding") PDef _def_)
    {
        // Constructor
        setDef(_def_);

    }

    @Override
    public Object clone()
    {
        return new ADefImpl(
            cloneNode(this._def_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefImpl(this);
    }

    public PDef getDef()
    {
        return this._def_;
    }

    public void setDef(PDef node)
    {
        if(this._def_ != null)
        {
            this._def_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._def_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._def_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._def_ == child)
        {
            this._def_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._def_ == oldChild)
        {
            setDef((PDef) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
