package com.example.squarecalculator;

public class Cube implements VolumeFigure{
    double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }
}
