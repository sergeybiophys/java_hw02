package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public void setHryvnia(long hryvnia)
    {
        this.hryvnia = hryvnia;
    }
    public long getHryvnia()
    {
        return hryvnia;
    }
    public void setKopecks(byte kopecks)
    {
        this.kopecks = kopecks;
    }
    public byte getKopecks()
    {
        return  kopecks;
    }

    public Money()
    {
        this.hryvnia = 1;
        this.kopecks = 0;
    }
    public Money(long hryvnia)
    {
        this.hryvnia = hryvnia;
        this.kopecks = 0;
    }
    public  Money(long hryvnia, byte kopecks)
    {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public Money addition(Money m)
    {
        int kopTmp = this.kopecks + m.kopecks;
        long hrn = this.hryvnia + m.hryvnia + kopTmp/100;
        byte kop = (byte) (kopTmp%100);
        return new Money(hrn,kop);
    }
    public Money subtraction(Money m)
    {
        int kopTmp = this.kopecks - m.kopecks;
        long hrn = this.hryvnia - m.hryvnia;
        if(kopTmp<0)
        {
            hrn--;
            kopTmp+=100;
        }
        byte kop = (byte)(kopTmp%100);
        return new Money(hrn,kop);
    }
    public Money division(double money)
    {
        double tmp = this.moneyToDouble();
        double result = tmp/money;
        return doubleToMoney(result);

    }
    public Money multiply(double money)
    {
        double tmp = this.moneyToDouble();
        double result = tmp*money;
        return doubleToMoney(result);
    }

    public  double moneyToDouble()
    {
        double tmp = 0;
        tmp =  (double)this.hryvnia + (double)(this.kopecks/10.0);
        return tmp;
    }
    public static Money doubleToMoney(double value)
    {
        int tmp = (int)value/1;
        long hrn = (long)value/1;
        double kopTmp = value-tmp;
        double roundedKop = Math.round(kopTmp*100)/100.0d;
        byte kop = (byte)(roundedKop*10);
        return new Money(hrn,kop);
    }

    public boolean equals(Money m)
    {
        if(this.hryvnia==m.hryvnia&&this.kopecks==m.kopecks)
        {
            return true;
        }
        return  false;
    }
}
