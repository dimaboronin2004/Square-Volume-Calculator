package com.example.squarecalculator;

public class Parallelogram implements FlatFigure{
    double a;
    double b;
    double sin;

    Parallelogram(double a, double b, double sin) {
        this.a = a;
        this.b = b;
        this.sin = sin;
    }

    @Override
    public double getSquare(){
        return a * b * sin;
    }
}
