/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TSection extends Token
{
    public TSection()
    {
        super.setText("�");
    }

    public TSection(int line, int pos)
    {
        super.setText("�");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSection(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSection(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSection text.");
    }
}
