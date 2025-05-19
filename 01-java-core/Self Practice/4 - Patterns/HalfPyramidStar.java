/*
Write a code to generate a pyramid using stars.


Input Description:
Given an integer R indicates numbers of rows.

Where 1<=R<=100.

Output Description:
Print the pyramid pattern using stars based on the given integer R.

Sample Input:
        6
Sample Output:
        *
        **
        ***
        ****
        *****
        ******
*/

import java.util.Scanner;

public class HalfPyramidStar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();

        for (int i = 1; i <= R; i++)
        {
            // Print spaces
            for (int j = 1; j <= R - i; j++)
            {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        scan.close();
    }
}
