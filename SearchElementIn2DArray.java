import java.util.Scanner;

public class SearchElementIn2DArray {

    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int num = input.nextInt();

        boolean isFoundNum = isFound(array , num);

        if(isFoundNum){
            System.out.println("Your number is found successfully");
        }
        else {
            System.out.println("Your number hasn't found:");
        }
    }

    public static boolean isFound(int[][] arr , int number){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                if (arr[i][j] == number){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
