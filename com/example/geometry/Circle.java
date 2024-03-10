package com.example.geometry;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius , 2);
    }
}
