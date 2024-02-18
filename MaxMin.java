import java.util.Scanner;

public class MaxMin {

//    Create a program to find the maximum and minimum element in an array

    public static void main(String[] args) {

        int[] arr = ArrayUtility.inputArray();

        int maximum = max(arr);

        System.out.println(maximum+ " is maximum element in array");

        int minimum = min(arr);

        System.out.println(minimum+ " is minimum element in array");

    }

    public static int max(int[] array){
        int max = array[0];
        int i = 0;
        while (i < array.length){
            if(array[i]>max){
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        int i = 0;
        while (i < array.length){
            if(array[i]< min){
                min = array[i];
            }
            i++;
        }
        return min;
    }

}

