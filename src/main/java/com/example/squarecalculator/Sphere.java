package com.example.squarecalculator;

public class Sphere implements VolumeFigure{
    double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}
