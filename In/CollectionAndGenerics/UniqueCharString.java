package In.CollectionAndGenerics;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharString {

    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check unique characters");
        String str = input.next();
        for (char i : str.toCharArray()) {
            unique.add(i);
        }
        System.out.printf("Your string have %d distinct character  %s", unique.size(), unique);
    }

}
