import java.util.Scanner;

public class CheckSortedArray {

//    Create a program to check if the given array is sorted.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArray = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(numArray);

        boolean isDec = isDecreasing(numArray);

        if(isInc || isDec){
            System.out.println("Given array is sorted");
        }
        else {
            System.out.println("Given array is not sorted");
        }
    }


    public static boolean isIncreasing(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] > array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
