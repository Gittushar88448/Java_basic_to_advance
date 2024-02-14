import java.util.Scanner;

public class ReverseDigit {

//    Create a program to reverse the digits of a number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int i = input.nextInt();

        int num = i;
        int temp, result = 0;


        while(num > 0 ){

            temp = num%10;

            result = result*10 + temp;

            num = num/10;
        }

        System.out.println("Reverse of the number is : "+ result);

    }
}
