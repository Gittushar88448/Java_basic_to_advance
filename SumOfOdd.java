import java.util.Scanner;

public class SumOfOdd {

//    Create a program to sum all odd numbers from 1 to a specified number N.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want to print the sum of odd number series: ");
        int num = input.nextInt();
        int i = 1;
        int result = 0;
        while(i <= num){
            System.out.print(i + "\t");
            if( i%2 != 0 ){
                result += i;
            }
            i++;
        }
            System.out.println("\nSum of Odd numbers in above series is: " + result);
    }
}
