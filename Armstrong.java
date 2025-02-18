import java.util.Scanner;

public class Armstrong {

//        Create a program to check the armstrong number of given number

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether armstrong or not: ");
        int num = input.nextInt();

        int power = findDigits(num);

        int armMethod = powerWithSum(num , power);

        if(armMethod == num){
            System.out.println(num+" is an armstrong number");
        }
        else {
            System.out.println(num+" is not an armstrong number");

        }
    }

    public static int powerWithSum(int n, int digit) {
        double result = 0;
        int lastDigit = 0;

        while (n > 0) {
            lastDigit = n % 10;
            result = result + Math.pow(lastDigit, digit);
            n = n / 10;
        }
        return (int)result;
    }

    public static int findDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;

    }

}
