/*
Write a code to generate a half-pyramid pattern using numbers.

Input Description:
Given an integer R indicates numbers of rows.

Where 1<=R<=100.

Output Description:
Print the number half-pyramid pattern with the size R.

Sample Input:
5
Sample Output:
55555
4444
333
22
1
 */


import java.util.Scanner;

public class HalfPyramidSameNo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();

        for (int i = R; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        scan.close();
    }
}
