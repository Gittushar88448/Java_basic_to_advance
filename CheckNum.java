import java.util.Scanner;
//  Write a program to check whether the given number is positive negative or zero

public class CheckNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num+" is positive integer");
        }
        else if (num < 0) {

            System.out.println(num+" is negative integer");
        }
        else {
            System.out.println(num+" : zero");
        }
    }
}
