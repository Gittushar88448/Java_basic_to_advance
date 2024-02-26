public class SumAvg2DArray {

//    Create a program to do sum and average of all elements in a 2-D array.

    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();

    int sum = sumOfElements(array);

    int count = countElements(array);

    float average = (float)sum/count;
        System.out.println("Total sum of elements of 2D array is : " + sum);

        System.out.print("Average of elements of 2D array is : " + average);


    }

    public static int sumOfElements(int[][] arr ){
         int sum = 0;
        int i = 0;
        while (i< arr.length){
            int j = 0;
            while (j< arr[i].length){
                sum = sum + arr[j][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int countElements(int[][] arr ){
         int count = 0;
        int i = 0;
        while (i< arr.length){
            int j = 0;
            while (j< arr[i].length){
                count += 1;
                j++;
            }
            i++;
        }
        return count;
    }



}
