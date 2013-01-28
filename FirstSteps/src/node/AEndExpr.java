/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEndExpr extends PExpr
{
    private THash _hash_;

    public AEndExpr()
    {
        // Constructor
    }

    public AEndExpr(
        @SuppressWarnings("hiding") THash _hash_)
    {
        // Constructor
        setHash(_hash_);

    }

    @Override
    public Object clone()
    {
        return new AEndExpr(
            cloneNode(this._hash_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEndExpr(this);
    }

    public THash getHash()
    {
        return this._hash_;
    }

    public void setHash(THash node)
    {
        if(this._hash_ != null)
        {
            this._hash_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hash_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._hash_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hash_ == child)
        {
            this._hash_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._hash_ == oldChild)
        {
            setHash((THash) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
