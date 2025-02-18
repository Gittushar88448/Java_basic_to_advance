import java.util.Scanner;

//Create a program using for-each to the occurrences of a specific element in an array.
public class OccurrenceUsingForEach {

    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the element to search occurrence in array: ");
        int num = input.nextInt();
        int result = occurrenceElement(array, num);
        System.out.println( num + " is "+ result+ " times occurred in array");
    }

    public static int occurrenceElement(int[] arr , int num){
        int count = 0;

        for (int number : arr){
            if(number == num){
                count++;
            }
        }
        return count;
    }
}
