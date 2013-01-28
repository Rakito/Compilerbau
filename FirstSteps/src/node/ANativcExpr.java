/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANativcExpr extends PExpr
{
    private TCcode _ccode_;

    public ANativcExpr()
    {
        // Constructor
    }

    public ANativcExpr(
        @SuppressWarnings("hiding") TCcode _ccode_)
    {
        // Constructor
        setCcode(_ccode_);

    }

    @Override
    public Object clone()
    {
        return new ANativcExpr(
            cloneNode(this._ccode_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANativcExpr(this);
    }

    public TCcode getCcode()
    {
        return this._ccode_;
    }

    public void setCcode(TCcode node)
    {
        if(this._ccode_ != null)
        {
            this._ccode_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ccode_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ccode_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ccode_ == child)
        {
            this._ccode_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ccode_ == oldChild)
        {
            setCcode((TCcode) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}