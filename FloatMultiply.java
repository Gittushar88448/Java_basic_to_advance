import java.util.Scanner;

// Program to multiply two floating point numbers

public class FloatMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  first decimal number : ");
        float one = input.nextFloat();

        System.out.print("Enter the  second decimal number : ");
        float two = input.nextFloat();

        float mul = one * two;
        System.out.println("multiplication of given numbers is : " + mul);
    }
}
