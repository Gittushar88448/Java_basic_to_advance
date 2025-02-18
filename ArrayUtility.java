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

    public static void printArray(int[] arr){
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows you want to add in array: ");
        int num1 = input.nextInt();
        System.out.print("Enter the columns you want to add in array: ");
        int num2 = input.nextInt();
        int[][] arr = new int[num1][num2];
        for (int i = 0; i< num1;i++){
            for (int j = 0; j < num2; j++){
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
        return arr;
    }
}
