/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnapp;

/**
 *
 * @author user
 */
public class complexn {
        private double x;
    private double y;
    public boolean purelyreal;
    
    public complexn(){
        x=0.0;
        y=0.0;
        purelyreal=true;
    }
    public complexn (double x){
        this.x=x;
        this.y=0.0;
        purelyreal=true;
    }
    public complexn(double x, double y){
        this.x=x;
        this.y=y;
        if (y==0)
            purelyreal=true;
        else
            purelyreal=false;
    }
    public complexn(complexn other){
        this.x=other.getReal();
        this.y=other.getImaginary();
        this.purelyreal=other.purelyreal;
    }
    public String toString(){
        if(purelyreal)
            return (String.valueOf(x));
        else if(y>0)
            return (String.valueOf(x)+" + "+String.valueOf(y)+"i");
        else
            return (String.valueOf(x)+" - "+String.valueOf(Math.abs(y))+"i");
    }
    double getReal(){return x;}
    double getImaginary(){return y;}
    
    void setReal(double x){this.x=x;}
    void setImaginary(double y){
        this.y=y;
        purelyreal=(y==0);
    }
    public complexn multiply(complexn b){
        double real = this.x * b.getReal() - this.y * b.getImaginary();
        double imaginary = this.x * b.getImaginary() + this.y * b.getReal();
        complexn cnMultiply = new complexn(real, imaginary);
        return cnMultiply;
    }
    public complexn add(complexn b){
        double real = this.x + b.getReal();
        double imaginary = this.y + b.getImaginary();
        complexn cnAdd = new complexn(real, imaginary);
        return cnAdd;
    }
    public complexn subtract(complexn b){
        double real = this.x - b.getReal();
        double imaginary = this.y - b.getImaginary();
        complexn cnSubtract = new complexn(real, imaginary);
        return cnSubtract;
    }
    public void multEqual(complexn b){
        double real = this.x * b.getReal() - this.y * b.getImaginary();
        double imaginary = this.x * b.getImaginary() + this.y * b.getReal();
        this.x=real;
        this.y=imaginary;
        this.purelyreal = (y==0.0);
    }
    
}


































