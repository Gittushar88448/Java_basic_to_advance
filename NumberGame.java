import java.util.Scanner;

//Create a number guessing game where the program selects a random number, and the user has to guess it.
public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("**** WELCOME TO NUMBER GUESSING GAME ****");

        System.out.println("Guess the number between 1 to 50");

         int rand = random();
        int num;
        do {
            System.out.println("Enter the number: ");
            num = input.nextInt();
            if(num < rand){
                System.out.println("Enter greater number");
            } else if ( num > rand) {
                System.out.println("Enter lesser number");
            }
            else {
                System.out.println(" Number found !");
            }
        }while (rand != num);


    }
    public static int random(){
        return  (int) Math.ceil( Math.random() * 50 );

    }

}
