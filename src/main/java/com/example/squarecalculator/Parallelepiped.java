package com.example.squarecalculator;

public class Parallelepiped implements VolumeFigure{
    double a;
    double b;
    double c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }
}
