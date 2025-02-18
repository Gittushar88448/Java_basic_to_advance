import java.util.Scanner;

// Create a program using recursion to check if a string is a palindrome using recursion.
public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to check palindrome or not: ");
        String str = input.next();
        System.out.println("Your string is "+ ((isPalindrome(str)) ? "Palindrome" : "not Palindrome"));

    }

    public static boolean isPalindrome(String name){
        if(name.length() == 1){
            return true;
        }
        int lastPos = name.length() - 1;
        if(name.charAt(0) != name.charAt(lastPos)){
            return false;
        }
        String subStr = name.substring(1 , lastPos);
        return isPalindrome(subStr);
    }
}
