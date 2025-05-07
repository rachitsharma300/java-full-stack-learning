/*
Write a code to get the input in the given format and print the output in the given format

Input Description:
Three integers are given in line by line.

Output Description:
Print the integers in a single line separate by space.

Sample Input:
2
4
5
Sample Output:
2 4 5
 */

import java.util.Scanner;

public class PortraitLandscape
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a + " " + b + " " + c);
    }
}
