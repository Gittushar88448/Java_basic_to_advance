

//ake an array of words and concatenate them into a single string using StringBuilder


import java.util.Scanner;

public class ConcatinateStringBuilder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[]{
                "Hello", "Friends", "Tushar", "here."
        };

        StringBuilder sentence = new StringBuilder();

        for (String elements : array) {
            sentence.append(elements).append(" ");
        }

        System.out.println(sentence);

    }



}
