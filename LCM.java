import java.util.Scanner;

public class LCM {

//    Create a program to find the Least Common Multiple (LCM) of two numbers.

    public static void main(String[] args) {
        System.out.println("Welcome to lcm calculator");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum =  input.nextInt();


        System.out.println("Enter the second number: ");
        int secondNum =  input.nextInt();

        int result = lcm(firstNum , secondNum);
        System.out.println("LCM of two numbers is : " + result);

    }

    public static int lcm(int first , int second){

        int i = 1;
        while ( true){
            int factor = first*i;
            if(factor % second ==0){
                return factor;
            }
            i++;
        }
    }


}
