import java.util.Scanner;

// Write a program to check whether the given number is odd or even
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println(num+ " is even");
        }
        else {
            System.out.println(num+" is odd");
        }
    }
}
