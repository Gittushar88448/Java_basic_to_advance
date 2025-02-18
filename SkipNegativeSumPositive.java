
//Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.
public class SkipNegativeSumPositive {

    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();

        int result = sumPositive(array);
        System.out.println("sum of positive number is: "+ result);
    }

    public static int sumPositive(int[] arr){
        int sum = 0;
        for (int num : arr) {

            if (num < 0) {
                continue;
            }
            else {
                sum += num;
            }
        }
        return sum;
    }

}
