import java.util.Scanner;

public class DeleteAnArrayElement {

//    create a program to return a new array deleting a specific element.

    public static void main(String[] args) {
        int[] arrayNum = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the Element which you want to delete in an array: ");
        int deleteElement = input.nextInt();

        int[] result = deletedElementArray(arrayNum, deleteElement);

        ArrayUtility.printArray(result);

    }

    public static int[] deletedElementArray(int[] arr , int element){

        int occur = OccurrenceNumber.occurrence(arr , element);

        int size = arr.length - occur;
        int[] newArray = new int[size];

        int i = 0 , j = 0;

        while (i < arr.length){

            if(arr[i] != element){

                newArray[j] = arr[i];
                j++;
            }

            i++;
        }
        return newArray;

    }


}
