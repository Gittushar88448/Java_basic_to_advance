package com.example.geometry;

public class Rectangle {

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getAreaRect(){
        return length*breadth;
    }

}
