package com.abstraction;

public class Circle extends Shape{

    private double radii;

    public double getRadii() {
        return radii;
    }

    public Circle(double radii) {
        this.radii = radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }

    @Override
    public double calculateArea() {

        return (2 * Math.PI * radii);
    }
}
