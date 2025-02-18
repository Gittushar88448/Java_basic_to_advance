import java.util.Scanner;

//Create a program to calculate the absolute value of a given integer.
public class Absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt();

        int result = num >= 0? num : -num;
        System.out.println("Absolute value of "+ num+ " is "+ result);

    }
}
