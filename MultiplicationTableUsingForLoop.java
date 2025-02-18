
// Write a program in java to print multiplication table of any number using for loop.

import java.util.Scanner;

public class MultiplicationTableUsingForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num +" * "+ i + " = "+ num * i );
        }

    }
}
