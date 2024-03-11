import java.util.Scanner;

//Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.
public class Concatenate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fName = input.next();

        System.out.print("Enter your last name: ");
        String lName = input.next();

        System.out.printf("Your full name is %s %s ", fName , lName);
        System.out.println();
        System.out.printf("%S %S", fName , lName);
    }

}
