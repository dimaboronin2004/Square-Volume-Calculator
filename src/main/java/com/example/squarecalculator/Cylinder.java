package com.example.squarecalculator;

public class Cylinder implements VolumeFigure {
    double r;
    double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
