import java.util.Scanner;

//Create a program to create a simple calculator that uses a switch statement to perform basic
// arithmetic operations like addition, subtraction, multiplication, and division
public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println(" Welcome to simple calculator");

        System.out.println("1. Addition \t 2. Subtraction \t 3. Multiplication \t 4. Division");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        calculator(num,num1,num2);

    }

    public static void calculator(int num ,int a , int b){
        switch (num){
            case 1:
                System.out.println("Addition of two number is: "+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction of two number is: "+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication of two number is: "+ (a*b));
                break;
            case 4:
                System.out.println("Division of two number is: "+ (a/b));
                break;
            default: throw new IllegalStateException("undefined value" + num);
        }
    }
}
