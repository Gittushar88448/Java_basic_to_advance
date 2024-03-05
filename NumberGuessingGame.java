import java.util.Scanner;

//Create a program using do-while to implement a number guessing game.
public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("- Welcome to the number guessing game -");
        Scanner input = new Scanner(System.in);
        int num  = input.nextInt();
        num = 3; int guess;
        do {
            System.out.println("Enter the number");
             guess = input.nextInt();
        }while (num != guess);
        System.out.println("You won !");
    }

}
