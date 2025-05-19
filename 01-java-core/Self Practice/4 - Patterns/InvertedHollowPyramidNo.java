/*
Generate a hollow inverted half-pyramid pattern using numbers.

Input Description:
Given an integer R indicates numbers of rows.

Where 1<=R<=100.

Output Description:
Print the hollow Inverted half-pyramid pattern using numbers based on the given integer R.

Sample Input:
5
Sample Output:
12345
1  4
1 3
12
1
 */


import java.util.Scanner;

public class InvertedHollowPyramidNo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();

        for (int i = R; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i || i == R)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
