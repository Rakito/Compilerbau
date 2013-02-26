/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TIn extends Token
{
    public TIn()
    {
        super.setText("in");
    }

    public TIn(int line, int pos)
    {
        super.setText("in");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIn(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIn(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIn text.");
    }
}
