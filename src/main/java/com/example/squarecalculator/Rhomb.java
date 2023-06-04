package com.example.squarecalculator;

public class Rhomb implements FlatFigure{
    double d1;
    double d2;

    Rhomb(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double getSquare() {
        return (d1 * d2) / 2;
    }
}
