import java.util.Arrays;

//Create a program using for-each to find the maximum value in an integer array.
public class MaxElementInArray {

    public static void main(String[] args) {

        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        int maximum = max(arr);
        System.out.println(maximum + " is maximum number in array");

    }
    public static int max(int[] arr){
        int maxi = Integer.MIN_VALUE;
         for(int num : arr){
            if (num > maxi){
                maxi = num;
            }
         }
         return maxi;
    }

}
