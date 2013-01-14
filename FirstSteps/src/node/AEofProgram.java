/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEofProgram extends PProgram
{
    private TEnd _end_;

    public AEofProgram()
    {
        // Constructor
    }

    public AEofProgram(
        @SuppressWarnings("hiding") TEnd _end_)
    {
        // Constructor
        setEnd(_end_);

    }

    @Override
    public Object clone()
    {
        return new AEofProgram(
            cloneNode(this._end_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEofProgram(this);
    }

    public TEnd getEnd()
    {
        return this._end_;
    }

    public void setEnd(TEnd node)
    {
        if(this._end_ != null)
        {
            this._end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._end_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._end_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._end_ == child)
        {
            this._end_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._end_ == oldChild)
        {
            setEnd((TEnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
