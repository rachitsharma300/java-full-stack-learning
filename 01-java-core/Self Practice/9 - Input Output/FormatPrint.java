/*
Write a code to get the input in the given format and print the output in the given format

Input Description:
First line indicates two integers separated by space. Second-line indicates two integers separated by space.
Third-line indicates two integers separated by space.

Output Description:
Print the input in the same format.

Sample Input:                                   Sample Output:
2 4                                              2 4
2 4                                              2 4
2 4                                              2 4
 */

import java.util.Scanner;

public class FormatPrint
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + " " + b);
        }
        scan.close();
    }
}
