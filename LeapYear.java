import java.util.Scanner;

public class LeapYear {

//    Create a program that determines if a given year is a leap year

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year to check either leap or not: ");
        int year = input.nextInt();

        if( (year%4 == 0) && (year%100) != 0 || (year%400) == 0 ){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+ " is not a leap year");
        }
    }
}
