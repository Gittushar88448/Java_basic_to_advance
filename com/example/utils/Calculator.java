package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        Circle one = new Circle(4.25);
        Rectangle rect = new Rectangle(25,60);
        float result = (float) one.getArea();
        System.out.println("Area of Circle is: "+ result);

        float resultRect = (float) rect.getAreaRect();
        System.out.println("Area of rectangle is: "+ resultRect);
    }

}
