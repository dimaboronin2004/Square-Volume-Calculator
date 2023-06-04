package com.example.squarecalculator;

public class Prism implements VolumeFigure{
    double s;
    double h;

    public Prism(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s * h;
    }
}
