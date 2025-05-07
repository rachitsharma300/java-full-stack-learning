/*
Generate a solid rectangle using stars.

Input Description:
Given an integer R indicates no of rows, and an integer C indicates no of columns.

Where 1<=R<=100 and Where 1<=C<=100.

Output Description:
Print the rectangle using stars with R rows and C columns.

Sample Input:
3 5
Sample Output :
* * * * *
* * * * *
* * * * *
 */

import java.util.Scanner;

public class SolidRectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                System.out.print("*");
                if (j != C - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
