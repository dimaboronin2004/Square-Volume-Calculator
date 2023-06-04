package com.example.squarecalculator;

public class Rectangle implements FlatFigure {
    double a;
    double b;
    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare(){
        return a * b;
    }
}
