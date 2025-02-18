import java.util.Scanner;

//Create a program using recursion to display the Fibonacci series upto a certain number.
public class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto you want fibonacci series: ");
        int num  = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println(fibo(i) + " ");
        }
    }
    public static int fibo(int number){
        if(number == 1){
            return 0;
        }

        if (number == 2){
            return 1;
        }

        return fibo(number - 1) + fibo(number - 2);
    }
}
