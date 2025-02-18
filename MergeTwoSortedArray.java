public class MergeTwoSortedArray {

    public static void main(String[] args) {

        System.out.println("Enter the first sorted array: ");
        int[] firstArray = ArrayUtility.inputArray();

        System.out.println("Enter the second sorted array: ");
        int[] secondArray = ArrayUtility.inputArray();

        int[] sortedArray = merge(firstArray , secondArray);
        ArrayUtility.printArray(sortedArray);
    }

    public static int[] merge(int[] first , int[] second){

        int size = first.length + second.length;
        int[] newArray = new int[size];

        int i = 0 , j= 0 , k = 0;

        while (i < first.length || j < second.length){
            if(j == second.length || (i< first.length && first[i] < second[j])){
                newArray[k] = first[i];
                i++;
                k++;

            }
            else {
                newArray[k] = second[j];
                k++;
                j++;
            }
        }
        return newArray;
    }

}
