package com.abstraction;

public class Test {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(4.53);
        Square firstSquare = new Square(5);

        System.out.println("Area of Circle is: " + firstCircle.calculateArea());
        System.out.println("Area of Square is: "+ firstSquare.calculateArea());

    }
}
