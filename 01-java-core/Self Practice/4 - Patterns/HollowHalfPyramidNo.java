/*
Generate a hollow half-pyramid pattern using numbers.

Input Description:
Given an integer R indicates numbers of rows.

Where 1<=R<=100.

Output Description:
Print the hollow half-pyramid pattern using numbers based on the given integer R.

Sample Input:
5
Sample Output:
1
12
1 3
1  4
12345
 */


import java.util.Scanner;

public class HollowHalfPyramidNo
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= i; j++) {

                // First row, last row, first column, or last column of the row
                if (j == 1 || j == i || i == R) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
