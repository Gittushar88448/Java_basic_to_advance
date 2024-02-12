import java.util.Scanner;
// Write a program to calculate the compound interest

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        int amt = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        int rate = input.nextInt();

        System.out.print("Enter the time in year: ");
        int time = input.nextInt();

        double calc = amt*Math.pow((1+(float)rate/100),time);

        System.out.println("Compound interest of given information is : "+calc);

    }
}
