package com.example.squarecalculator;

public class Square implements FlatFigure{
    double a;
    Square(double a) {
        this.a = a;
    }
    @Override
    public double getSquare(){
        return Math.pow(a, 2);
    }
}
