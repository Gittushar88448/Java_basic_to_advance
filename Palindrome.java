import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to check palindrome or not: ");
        int i = input.nextInt();

        int num = i;
        int temp, result = 0;


        while (num > 0) {

            temp = num % 10;

            result = result * 10 + temp;

            num = num / 10;
        }

        if (result == i) {
            System.out.println(i + " is a Palindrome number");
        } else {
            System.out.println(i + " is not a Palindrome number");

        }

    }

}
