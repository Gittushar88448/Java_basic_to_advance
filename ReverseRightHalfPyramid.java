import java.util.Scanner;

public class ReverseRightHalfPyramid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int row = num;
        while (row > 0) {

            System.out.print("*");

            int col = row - 1;
            while (col > 0) {
                System.out.print(" *");
                col--;

            }
            System.out.println();

            row--;
        }


    }
}
