package com.ArithmeticErrorHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void division(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        try{
            int result = num1/num2;
            System.out.println(result);

        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("divide by zero occur");
            }else {
                throw exception;
            }
        }


    }


    public static void main(String[] args) {
        division();
    }

}
