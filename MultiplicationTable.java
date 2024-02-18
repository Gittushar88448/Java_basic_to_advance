import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

//        Develop a program that prints the multiplication table for a given number.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number which you want to print the multiplication table :  ");
        int num = input.nextInt();

        int i = 1;
        while(i <= 10){

            System.out.println(num + " * " + i + " = " + num * i );

            i++;
        }

    }
}
