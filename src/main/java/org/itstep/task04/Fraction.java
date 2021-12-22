package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
    public int getDenominator()
    {
        return denominator;
    }

    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        if(denominator==0)
        {
            throw new ArithmeticException("The denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public static int gcd(int numerator, int denominator)//greatest common divisor
    {
        if (numerator == denominator) return numerator;
        if (numerator > denominator) return gcd(numerator - denominator, denominator);
        if (numerator < denominator) return gcd(denominator, denominator - numerator);
        return 1;
    }
    public static Fraction gcdHelper(Fraction f)
    {
        int k = gcd(f.numerator, f.denominator);
        f.numerator /= k;
        f.denominator /= k;
        return f;
    }

    public Fraction addition(Fraction f)
    {

        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        result.denominator = this.denominator * f.denominator;
        return gcdHelper(result);
    }

    public Fraction subtraction(Fraction f)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator -
                f.numerator * this.denominator;
        result.denominator = this.denominator * f.denominator;

        return gcdHelper(result);
    }
    public Fraction multiplication(Fraction f)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return gcdHelper(result);
    }
    public Fraction division(Fraction f)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator;
        result.denominator = this.denominator * f.numerator;

        return gcdHelper(result);
    }
}
