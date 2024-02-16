import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elements you want to add in array: ");
        int num = input.nextInt();
        int[] arr = new int[num];

        int i = 0;

        System.out.println("Enter the array elements: "+ " ");
        while (i < num){

            arr[i] = input.nextInt();
            i++;
        }
        return arr;

    }

}
