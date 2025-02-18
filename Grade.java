import java.util.Scanner;

public class Grade {
//    Create a program that calculates grades based on marks
//    A -> above 90 B -> above 75
//    C -> above 60 D -> above 30
//    F -> below 30

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the getting marks out of 100 : ");
        int marks = input.nextInt();

        if(marks > 90 && marks <= 100){
            System.out.println("Congratulations you have got grade : A");
        }
        else if ( marks > 75 && marks <= 90) {
            System.out.println("You have got grade : B");
        }
        else if (marks > 60 && marks <= 75) {
            System.out.println("you have got grade : C");
        }
        else if (marks > 30 && marks <= 60) {
            System.out.println("you have got grade : D");
        }
        else {
            System.out.println("you have got grade : F");
        }
    }
}
