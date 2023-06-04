package com.example.squarecalculator;

public class Cone implements VolumeFigure{
    double r;
    double h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }
}
