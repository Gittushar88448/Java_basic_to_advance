public class SumOfTwoDiagonalElements {

    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();

        int sum = sumOfTwoDiagonalElement(array);
        System.out.println("sum of two diagonal elements is : " + sum);


    }

    public static int sumOfTwoDiagonalElement(int[][] arr ){
        int sum = 0;
        int i = 0;
        while (i< arr.length ){

            int leftSum = sumOfLeftDiagonal(arr);
            int rightSum = sumOfRightDiagonal(arr);

            sum = leftSum + rightSum;

            if(arr.length % 2 != 0){

            int ind = arr.length/2;
            sum -= arr[ind][ind];

            }
            i++;
        }
        return sum;
    }

    public static int sumOfLeftDiagonal(int[][] arr){

        int sum = 0;
        int i = 0;
        while (i< arr.length){
             sum += arr[i][i];
            i++;
        }

        return sum;
    }

    public static int sumOfRightDiagonal(int[][] arr){

        int sum = 0;
        int i = 0;
        while (i< arr.length){
            int j = arr.length-1-i;
                sum += arr[i][j];
            i++;
        }
        return sum;
    }

}
