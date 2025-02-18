public class ReverseArrayElement {

//    . Create a program to reverse an array

    public static void main(String[] args) {

        int[] arrayNum = ArrayUtility.inputArray();

//       Reverse array from method 1

//        int[] result = reverse(arrayNum);

//        ArrayUtility.printArray(result);


//        Reverse array from method 2

        int[] res = reverseArrayMethod2(arrayNum);

        System.out.println(" Reverse array : ");

        ArrayUtility.printArray(res);

    }

//    public static int[] reverse(int[] arr){
//
//        int size = arr.length;
//
//        int[] newArray = new int[size];
//
//        int i = arr.length-1 , j = 0;
//        while (i != -1){
//
//            newArray[j] = arr[i];
//            j++;
//            i--;
//        }
//        return newArray;
//    }


    public static int[] reverseArrayMethod2(int[] arr){

        int i = 0;
        while (i < arr.length/2){

            //Swapping

           int temp = arr[i];
            arr[i] = arr[(arr.length- 1) - i];
            arr[(arr.length- 1) - i] = temp;
            i++;

        }
        return arr;
    }

}
