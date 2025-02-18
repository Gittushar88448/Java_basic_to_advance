import java.util.Scanner;

public class Fibonacci {

//    Create a program to print the Fibonacci series up to a certain number.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();

        fibo(num);

    }

    public static void fibo(int n) {

        int first = 0 , second = 1;

        if(n < 0) return;
        System.out.print("0 ");

        if(n == 0) return;
        System.out.print("1 ");

        while (first+second<= n){

            int third = first + second;

            System.out.print(third+" ");

            first = second;
            second = third;


        }

    }
}
