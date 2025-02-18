import java.util.Scanner;

//Create a program to find the minimum of two numbers
public class MinimumOfTwoNum {
    public static void main(String[] args) {

        System.out.println(" ternary operator concept implementation");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int num1 = input.nextInt();

        System.out.println("Enter the Second Number");
        int num2 = input.nextInt();

        MinimumOfTwoNum ternary = new MinimumOfTwoNum();

        int min = ternary.min(num1 , num2);

        System.out.println("minimum number is " + min);

    }

    public static int min(int a , int b){
         int result = a < b? a : b;
         return result;
    }
}
