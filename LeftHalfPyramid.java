import java.util.Scanner;

public class LeftHalfPyramid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int row = num;


        while (row > 0) {

            int j = 0;
            while (j < row - 1) {
                System.out.print("  ");
                j++;
            }

            int col = 0;
            while (col <= (num - row)) {
                System.out.print("* ");
                col++;

            }

            System.out.println();

            row--;
        }

    }

}
