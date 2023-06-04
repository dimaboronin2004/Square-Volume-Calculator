package com.example.squarecalculator;

public class CutPyramid implements VolumeFigure{
    double s1;
    double s2;
    double h;

    public CutPyramid(double s1, double s2, double h){
        this.s1 = s1;
        this.s2 = s2;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * h * (s1 + s2 + Math.sqrt(s1 * s2));
    }
}
