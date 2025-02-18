
//Create a program using do-while to find password checker until a valid
//password is entered.

import java.util.Scanner;

public class ValidPasswordChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- Welcome to valid password checker -");
        String pass;
        do {
            System.out.println("Enter the valid password: ");
            pass = input.next();
        }while (!isValidPassword(pass));
        System.out.println("Congratulations! you have made strong password successfully ");

    }

    public static boolean isValidPassword(String password) {

        return password.length() > 6 ;

    }

}
