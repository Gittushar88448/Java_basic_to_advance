import java.util.Scanner;

//Create a program to find if the given number is even or odd.
public class OddEvenTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt();

        OddEvenTernary check = new OddEvenTernary();
        check.isEven(num);
    }

    public static void isEven(int num ){
        if(num%2 == 0){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
