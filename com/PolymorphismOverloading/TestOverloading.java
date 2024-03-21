package com.PolymorphismOverloading;

public class TestOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3,6));
        System.out.println(calc.add(5,8,12));
        System.out.println(calc.add(5.64 , 32.47));
    }
}
