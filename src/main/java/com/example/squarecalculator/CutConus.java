package com.example.squarecalculator;

public class CutConus implements VolumeFigure{
    double r1;
    double r2;
    double h;

    public CutConus(double r1, double r2, double h) {
        this.r1 = r1;
        this.r2 = r2;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * h * (Math.pow(r1, 2) + Math.pow(r2, 2) + r1 * r2);
    }
}
