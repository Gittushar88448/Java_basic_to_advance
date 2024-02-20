import java.util.Scanner;

public class OccurrenceNumber {

//    Create a program to find number of occurrences of an element in an
//    array.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elements you want to add in array: ");
        int num = input.nextInt();
        int[] array = new int[num];

        int i = 0;

        System.out.println("Enter the array elements: "+ " ");
        while (i < num){

            array[i] = input.nextInt();
            i++;
        }

        System.out.println("Enter the number you want to search occurrence: ");
        int search = input.nextInt();

        int occurElement = occurrence(array , search);

        System.out.println(search+" is occurring in array "+ occurElement+ " times");
    }

    public static int occurrence(int[] array , int num){

        int j = 0 , count = 0;
        while (j < array.length){
            if(array[j] == num){
                count++;
            }
            j++;
        }
        return count;

    }

}
