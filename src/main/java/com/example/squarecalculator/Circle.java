package com.example.squarecalculator;

public class Circle implements FlatFigure{
    double r;
    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare(){
        return Math.PI * Math.pow(r, 2);
    }
}
