import java.util.Scanner;
// Write a program to check the greater number amongst three number

public class GreaterNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int sec = input.nextInt();

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if (first>sec && first>third){
            System.out.println(first+" is greater");

        }

        else if (sec>first && sec>third) {
            System.out.println(sec + " is greater");
        }

        else {
            System.out.println(third+ " is greater");
        }
    }
}
