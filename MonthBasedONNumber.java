import java.util.Scanner;

//Create a program to print the month of the year based on a number (1-12) input by the user
public class MonthBasedONNumber {
    public static void main(String[] args) {
        System.out.println(" Enter the number and get the month name");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();

        String result = switch(num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Enter value between 1 and 12: " + num);
        };
        System.out.println(result);
    }
}
