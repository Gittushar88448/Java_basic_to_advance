import java.util.Scanner;

public class SumOfDigit {

//    Create a program that computes the sum of the digits of an integer.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int i = input.nextInt();

        int temp, result = 0;
        while(i > 0 ){

            temp = i%10;

            result = result+temp;

            i = i/10;
        }

        System.out.println("Sum of series is : "+ result);

    }

}
