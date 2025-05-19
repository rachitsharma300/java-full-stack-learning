/*
Write a code to get an integer N and print the values from N to 1.

Input Description:
A single line contains an integer N.

Output Description:
Print the values from N to 1 in a separate line.

Sample Input:
10
Sample Output:
10
9
8
7
6
5
4
3
2
1
 */


import java.util.Scanner;

public class NumPrint
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = N; i >= 1; i--)
        {
            System.out.println(i);
        }
        scan.close();
    }
}
