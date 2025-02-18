import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        int result = num & 1;
        if(result == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    }
}
