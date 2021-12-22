package org.itstep.task07;

public class Complex {
    private double real;
    private  double imaginary;

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex(double real,double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real)
    {
        this.real = real;
    }
    public double getReal()
    {
        return  real;
    }

    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }
    public  double getImaginary()
    {
        return  imaginary;
    }

    public String toString()
    {
        //return (this.real + " + " + this.imaginary+"i");
        if (this.imaginary == 0)
        {
            return (this.real+"");
        }
        if(this.real == 0&&this.imaginary!=0)
        {
            return (this.imaginary+"i");
        }
        else
        {
            if (this.imaginary > 0)
            {
                if (this.imaginary == 1)
                {
                    return (this.real+" + "+this.imaginary+ "i");
                }
                else
                {
                    return (this.real  + " + " + this.imaginary + "i");
                }
            }
            else
            {
                if (Math.abs(this.imaginary) == 1)
                {
                    return (this.real + " - i" );
                }
                else
                {
                    return (this.real + " - " +  Math.abs(this.imaginary)+ "i");
                }
            }
        }
    }

    public  Complex plus(Complex z2)
    {
        Complex result =  new Complex();
        result.real = this.real + z2.real;
        result.imaginary = this.imaginary + z2.imaginary;
        return result;
    }
    public Complex minus(Complex z2)
    {
        Complex result =  new Complex();
        result.real = this.real - z2.real;
        result.imaginary = this.imaginary - z2.imaginary;
        return result;
    }

    public Complex times(Complex z2)
    {
        Complex result = new Complex();
        if(z2.real==0&&z2.imaginary==0)
        {
            throw new ArithmeticException("Division by zero");
        }
        result.real = (this.real*z2.real + this.imaginary*z2.imaginary)/
                (Math.pow(z2.real,2)+Math.pow(z2.imaginary,2));
        result.imaginary = (z2.real*this.imaginary-this.real*z2.imaginary)/
                (Math.pow(z2.real,2)+Math.pow(z2.imaginary,2));
        return  result;
    }
}
