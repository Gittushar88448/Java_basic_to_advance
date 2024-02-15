import java.util.Scanner;

public class Factorial {

//    . Write a function that calculates the factorial of a given number.

    public static void main(String[] args) {

        System.out.println("Please enter the number greater than equals to zero");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number which you want to find the factorial: ");
        int num = input.nextInt();
        int fact = factorialFunc(num);
        System.out.println(fact);
    }

    public static int factorialFunc(int num){
        if (num <= 1 ){
            return 1;
        }
        else {
            int result = 1;

             while (num >= 1){
                 result *= num;
                 num--;
             }
                 return result;
        }
    }

}
