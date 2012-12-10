/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexer;

import java.io.*;
import node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private PushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") PushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        // int middle = (low + high) / 2;
                        int middle = (low + high) >>> 1;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 22:
                        {
                            @SuppressWarnings("hiding") Token token = new22(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 23:
                        {
                            @SuppressWarnings("hiding") Token token = new23(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 24:
                        {
                            @SuppressWarnings("hiding") Token token = new24(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 25:
                        {
                            @SuppressWarnings("hiding") Token token = new25(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 26:
                        {
                            @SuppressWarnings("hiding") Token token = new26(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 27:
                        {
                            @SuppressWarnings("hiding") Token token = new27(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 28:
                        {
                            @SuppressWarnings("hiding") Token token = new28(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 29:
                        {
                            @SuppressWarnings("hiding") Token token = new29(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 30:
                        {
                            @SuppressWarnings("hiding") Token token = new30(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 31:
                        {
                            @SuppressWarnings("hiding") Token token = new31(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 32:
                        {
                            @SuppressWarnings("hiding") Token token = new32(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 33:
                        {
                            @SuppressWarnings("hiding") Token token = new33(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 34:
                        {
                            @SuppressWarnings("hiding") Token token = new34(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 35:
                        {
                            @SuppressWarnings("hiding") Token token = new35(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 36:
                        {
                            @SuppressWarnings("hiding") Token token = new36(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 37:
                        {
                            @SuppressWarnings("hiding") Token token = new37(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 38:
                        {
                            @SuppressWarnings("hiding") Token token = new38(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 39:
                        {
                            @SuppressWarnings("hiding") Token token = new39(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 40:
                        {
                            @SuppressWarnings("hiding") Token token = new40(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 41:
                        {
                            @SuppressWarnings("hiding") Token token = new41(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 42:
                        {
                            @SuppressWarnings("hiding") Token token = new42(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 43:
                        {
                            @SuppressWarnings("hiding") Token token = new43(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 44:
                        {
                            @SuppressWarnings("hiding") Token token = new44(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 45:
                        {
                            @SuppressWarnings("hiding") Token token = new45(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDefine(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFunc(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBegin(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEnd(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCons(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TWhere(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBreak(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTrue(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFalse(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TReturnt(line, pos); }
    Token new10(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TId(text, line, pos); }
    Token new11(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumber(text, line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPlus(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new THyphen(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAsterisk(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPercent(line, pos); }
    Token new16(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDot(line, pos); }
    Token new17(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComma(line, pos); }
    Token new18(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TQuery(line, pos); }
    Token new19(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TColon(line, pos); }
    Token new20(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSemicolon(line, pos); }
    Token new21(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLBox(line, pos); }
    Token new22(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRBox(line, pos); }
    Token new23(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLPar(line, pos); }
    Token new24(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRPar(line, pos); }
    Token new25(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLBrace(line, pos); }
    Token new26(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRBrace(line, pos); }
    Token new27(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLArrow(line, pos); }
    Token new28(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRArrow(line, pos); }
    Token new29(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new30(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDash(line, pos); }
    Token new31(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAmpersand(line, pos); }
    Token new32(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSlash(line, pos); }
    Token new33(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TQuestion(line, pos); }
    Token new34(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TExclamation(line, pos); }
    Token new35(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAt(line, pos); }
    Token new36(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTilde(line, pos); }
    Token new37(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSection(line, pos); }
    Token new38(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TUnderscore(line, pos); }
    Token new39(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPipe(line, pos); }
    Token new40(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new THash(line, pos); }
    Token new41(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCaret(line, pos); }
    Token new42(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDegree(line, pos); }
    Token new43(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlackslash(line, pos); }
    Token new44(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TReturn(text, line, pos); }
    Token new45(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComment(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{10, 10, 1}, {13, 13, 2}, {32, 32, 3}, {33, 33, 4}, {35, 35, 5}, {37, 37, 6}, {38, 38, 7}, {40, 40, 8}, {41, 41, 9}, {42, 42, 10}, {43, 43, 11}, {44, 44, 12}, {45, 45, 13}, {46, 46, 14}, {47, 47, 15}, {48, 57, 16}, {58, 58, 17}, {59, 59, 18}, {60, 60, 19}, {62, 62, 20}, {63, 63, 21}, {64, 64, 22}, {65, 69, 23}, {70, 70, 24}, {71, 83, 23}, {84, 84, 25}, {85, 90, 23}, {91, 91, 26}, {92, 92, 27}, {93, 93, 28}, {94, 94, 29}, {95, 95, 30}, {97, 97, 31}, {98, 98, 32}, {99, 99, 33}, {100, 100, 34}, {101, 101, 35}, {102, 102, 36}, {103, 113, 31}, {114, 114, 37}, {115, 118, 31}, {119, 119, 38}, {120, 122, 31}, {123, 123, 39}, {124, 124, 40}, {125, 125, 41}, {126, 126, 42}, {167, 167, 43}, {176, 176, 44}, {8260, 8260, 45}, },
            {},
            {},
            {{32, 32, 3}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {{48, 57, 16}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {{48, 57, 46}, {65, 90, 47}, {97, 122, 48}, },
            {{48, 57, 46}, {65, 65, 49}, {66, 90, 47}, {97, 122, 48}, },
            {{48, 57, 46}, {65, 81, 47}, {82, 82, 50}, {83, 90, 47}, {97, 122, 48}, },
            {},
            {},
            {},
            {},
            {},
            {{48, 122, -25}, },
            {{48, 90, -25}, {97, 100, 48}, {101, 101, 51}, {102, 113, 48}, {114, 114, 52}, {115, 122, 48}, },
            {{48, 90, -25}, {97, 110, 48}, {111, 111, 53}, {112, 122, 48}, },
            {{48, 100, -34}, {101, 101, 54}, {102, 122, 48}, },
            {{48, 90, -25}, {97, 109, 48}, {110, 110, 55}, {111, 122, 48}, },
            {{48, 90, -25}, {97, 116, 48}, {117, 117, 56}, {118, 122, 48}, },
            {{48, 100, -34}, {101, 101, 57}, {102, 122, 48}, },
            {{48, 90, -25}, {97, 103, 48}, {104, 104, 58}, {105, 122, 48}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {{8260, 8260, 59}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
            {{48, 57, 46}, {65, 75, 47}, {76, 76, 60}, {77, 90, 47}, {97, 122, 48}, },
            {{48, 57, 46}, {65, 84, 47}, {85, 85, 61}, {86, 90, 47}, {97, 122, 48}, },
            {{48, 90, -25}, {97, 102, 48}, {103, 103, 62}, {104, 122, 48}, },
            {{48, 100, -34}, {101, 101, 63}, {102, 122, 48}, },
            {{48, 109, -37}, {110, 110, 64}, {111, 122, 48}, },
            {{48, 90, -25}, {97, 101, 48}, {102, 102, 65}, {103, 122, 48}, },
            {{48, 90, -25}, {97, 99, 48}, {100, 100, 66}, {101, 122, 48}, },
            {{48, 109, -37}, {110, 110, 67}, {111, 122, 48}, },
            {{48, 90, -25}, {97, 115, 48}, {116, 116, 68}, {117, 122, 48}, },
            {{48, 100, -34}, {101, 101, 69}, {102, 122, 48}, },
            {{0, 65535, 70}, },
            {{48, 57, 46}, {65, 82, 47}, {83, 83, 71}, {84, 90, 47}, {97, 122, 48}, },
            {{48, 57, 46}, {65, 68, 47}, {69, 69, 72}, {70, 90, 47}, {97, 122, 48}, },
            {{48, 90, -25}, {97, 104, 48}, {105, 105, 73}, {106, 122, 48}, },
            {{48, 90, -25}, {97, 97, 74}, {98, 122, 48}, },
            {{48, 90, -25}, {97, 114, 48}, {115, 115, 75}, {116, 122, 48}, },
            {{48, 104, -64}, {105, 105, 76}, {106, 122, 48}, },
            {{48, 122, -25}, },
            {{48, 90, -25}, {97, 98, 48}, {99, 99, 77}, {100, 122, 48}, },
            {{48, 116, -38}, {117, 117, 78}, {118, 122, 48}, },
            {{48, 90, -25}, {97, 113, 48}, {114, 114, 79}, {115, 122, 48}, },
            {},
            {{48, 68, -63}, {69, 69, 80}, {70, 122, -63}, },
            {{48, 122, -25}, },
            {{48, 109, -37}, {110, 110, 81}, {111, 122, 48}, },
            {{48, 90, -25}, {97, 106, 48}, {107, 107, 82}, {108, 122, 48}, },
            {{48, 122, -25}, },
            {{48, 109, -37}, {110, 110, 83}, {111, 122, 48}, },
            {{48, 122, -25}, },
            {{48, 113, -71}, {114, 114, 84}, {115, 122, 48}, },
            {{48, 100, -34}, {101, 101, 85}, {102, 122, 48}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
            {{48, 100, -34}, {101, 101, 86}, {102, 122, 48}, },
            {{48, 109, -37}, {110, 110, 87}, {111, 122, 48}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
            {{48, 122, -25}, },
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {29, 44, 44, 29, 34, 40, 15, 31, 23, 24, 14, 12, 17, 13, 16, 32, 11, 19, 20, 27, 28, 18, 35, 10, 10, 10, 21, 43, 22, 41, 38, 10, 10, 10, 10, 10, 10, 10, 10, 25, 39, 26, 36, 37, 42, -1, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, -1, 10, 10, 10, 10, 10, 10, 3, 10, 10, 10, 45, 10, 7, 10, 10, 4, 10, 1, 10, 10, 8, 2, 6, 10, 10, 5, 0, 9, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}
