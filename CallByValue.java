import java.util.Scanner;

public class CallByValue {

    public static int sum(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter two numbers");
        int one = input.nextInt();
        int two = input.nextInt();
        System.out.println(CallByValue.sum(one, two));
    }

}
