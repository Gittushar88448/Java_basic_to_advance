import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

//        Write a program to check whether the given number is prime or not

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();

        int i = 1;
        int temp = 0;
        while (i < num){
            if(num%i == 0){
                temp++;
            }
            i++;
        }

        if(temp == 1){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }


    }
}
