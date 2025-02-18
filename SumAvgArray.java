import java.util.Scanner;

public class SumAvgArray {

//    Create a program to find the sum and average of all elements in an
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
        int sum ;

        float average;

        sum = sum(array);
        System.out.println("Sum of the array's elements is : " + sum);

        average = avg(array);

        System.out.println("Average of the array's elements is : " + average);

    }

    public static int sum(int[] array ){

        int i = 0, result = 0;
        while (i < array.length){
            result += array[i];
            i++;
        }
        return result;
    }

    public static float avg(int[] array ){

        int i = 0 ;
        float result = 0;

        while (i < array.length){
            result += array[i];
            i++;
        }

        return result/array.length;
    }

}
