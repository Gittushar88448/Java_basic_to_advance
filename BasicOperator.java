import java.util.Scanner;
public class BasicOperator {
    public static void main(String[] args) {



//        Create a program that takes two numbers and perform all arithmetic operations on them.
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

//      Addition
                int sum = num1+num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);

//      Subtraction
                int subtract = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + subtract);

//      Multiplication
                int multiply = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + multiply);

//      Division
                float divide = (float) num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + divide);

//      Modulo
                int modulo = num1%num2;
                System.out.println(num1 + " % " + num2 + " = " + modulo);

    }
}