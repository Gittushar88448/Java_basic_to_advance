import java.util.Scanner;

public class GCD {

    // write a program to calculate the gcd of two numbers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        int result = gcd(firstNum, secondNum);
        System.out.println("GCD of two numebrs is : " + result);
    }


    public static int gcd( int first , int second){
        int gcdNum = 1;
        int i = 2;
        int miniNum = min(first, second);
        while (i <= miniNum){
            if(first % i == 0 && second % i == 0){
                gcdNum = i;
            }
            i++;
        }
        return gcdNum;
    }

    public static int min( int first , int second){
        if(first < second){
            return first;
        }
        else {
            return second;
        }
    }
}
