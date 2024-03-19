package com.abstraction;

public class Square extends Shape {

    private  double sideOfSquare;

    public double getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double calculateArea() {
        return ( Math.pow(sideOfSquare , 2));
    }
}
