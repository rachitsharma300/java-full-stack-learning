/*
Write a code to generate a pyramid using stars.

Input Description:
Given an integer R indicates numbers of rows.

Where 1<=R<=100.

Output Description:
Print the pyramid pattern using stars based on the given integer R.

Sample Input:
5
Sample Output:
*****
 ****
  ***
   **
    *

 */

import java.util.Scanner;

public class InvertFlipPyramidStar
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();

        for (int i = 1; i <= R; i++)
        {
            for (int space = 1; space < i; space++)
            {
                System.out.print(" ");
            }
            for (int star = 1; star <= R - i + 1; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}