package com.example.squarecalculator;

public class Triangle implements FlatFigure{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare(){
        double p = a + b + c;
        double byFormula = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(byFormula);
    }
}
