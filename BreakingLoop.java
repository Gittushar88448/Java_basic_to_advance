import java.util.Scanner;

//Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.
public class BreakingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write \"exit\" for out of loop");
        while (true){
            System.out.print("Enter the command: ");
            String command = input.next();
            if (command.equals("exit")){
                break;
            }
        }
        System.out.println("You are now out of loop");
    }
}
