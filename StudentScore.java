import java.util.Scanner;

//Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the
// ternary operator (e.g.,High for scores > 80, Moderate for 50-80, Low for < 50).
public class StudentScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student score ");
        float num = input.nextFloat();

        String result = num > 80 ? "High Grade" : (num > 50)&&(num<80)? "Moderate Grade" : "Low Grade";
        System.out.println(result);
    }
}
