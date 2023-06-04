package com.example.squarecalculator;

public class Polygon implements FlatFigure{
    public int n;
    public double a;
    public double r;

    Polygon(int n, double a, double r) {
        this.n = n;
        this.a = a;
        this.r = r;
    }

    @Override
    public double getSquare() {
        return 0.5 * a * n * r;
    }
}
