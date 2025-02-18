import java.util.Scanner;

//Create a program using for to display if a number is prime or not.
public class PrimeForLoop {

    public static void main(String[] args) {

        System.out.println("- Number is prime or not -");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        isPrime(num);

    }

    public static void isPrime(int number){
        int count = 0;
        for(int i = 1; i < number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count != 1){
            System.out.println("Number is not prime");
        }else {
            System.out.println("Number is prime");
        }
    }
}
