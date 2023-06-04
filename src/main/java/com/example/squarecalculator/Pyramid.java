package com.example.squarecalculator;

public class Pyramid implements VolumeFigure {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * s * h;
    }
}
