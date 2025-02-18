import java.util.Scanner;

public class AgeGroup {
//    Create a program that categorize a person into different age groups
//    Child -> below 13 Teen -> below 20
//    Adult -> below 60 Senior-> above 60


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if(age > 60 && age <= 100){
            System.out.println("senior ");
        }
        else if ( age > 20 && age <= 60) {
            System.out.println("Adult");
        }
        else if (age > 13 && age <= 20) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Child");
        }
    }
}
