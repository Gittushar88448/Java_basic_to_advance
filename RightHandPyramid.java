import java.util.Scanner;

public class RightHandPyramid {

    /*         *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int row = 0;


        while (row < num) {

            System.out.print("*");
            int col = 0;
            while (col < row) {
                System.out.print(" *");
                col++;
            }
            System.out.println();
            row++;

        }
    }

}
