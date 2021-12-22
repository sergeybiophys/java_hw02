package org.itstep.task06;

public class MainString {
    private char[] chars;

    public char[] getChars()
    {
        return this.chars;
    }

    public MainString(){
        this.chars = new char[0];
    }

    public MainString(CharSequence data)
    {
        this.chars = data.toString().toCharArray();
    }
    public MainString(char symbol, int length)
    {
        this.chars = new char[length];
        for(int i = 0;i<length;i++)
        {
            this.chars[i]=symbol;
        }
    }
    public int length()
    {
        return this.chars.length;
    }

    public void clean()
    {
        this.chars = new char[0];
    }

    public MainString concat(MainString other)
    {
        String one = new String(this.chars);
        String two = String.valueOf(other.chars);

        CharSequence tmp  = one+two;
        return new MainString(tmp);
    }

    public int indexOf(int symbol)
    {
        int idx = -1;
        for(int i = 0; i<chars.length;i++)
        {
            if(this.chars[i]==(char)symbol)
            {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public String toString()
    {
        return new String(this.chars);
    }

}
