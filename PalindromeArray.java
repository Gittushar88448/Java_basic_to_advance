public class PalindromeArray {

    public static void main(String[] args) {

        int[] arrayNum = ArrayUtility.inputArray();

        int[] result = reverse(arrayNum);

        boolean isPalindrome = isPalindrome(arrayNum , result);

        if(isPalindrome){
            System.out.println("yes array is Palindrome ");

        }

        else {
            System.out.println("Given array is not a palindrome");
        }

    }

        public static int[] reverse(int[] arr){

        int size = arr.length;

        int[] newArray = new int[size];

        int i = arr.length-1 , j = 0;
        while (i != -1){

            newArray[j] = arr[i];
            j++;
            i--;
        }
        return newArray;
    }

    public static boolean isPalindrome(int[] array , int[] reverseArray){
        int i = 0;
        while (i< array.length){
            if(array[i] != reverseArray[i]){
                return false;
            }
            i++;
        }
        return true;
    }


}
