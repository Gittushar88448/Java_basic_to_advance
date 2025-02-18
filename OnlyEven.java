
//Create a program using continue to print only even numbers using continue for odd numbers.
public class OnlyEven {

    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        for (int num : numArray){
            if(num%2 != 0){
                continue;
            }
            else {
                System.out.print(num+ " ");
            }
        }

    }
}
