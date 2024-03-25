package com.ArithmeticErrorHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static int division(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        return num1/num2;
    }


}
