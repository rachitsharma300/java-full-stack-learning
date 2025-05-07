/*
Write a code to get the input in the given format and print the output in the given format

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by space.

Sample Input:
guvi
Sample Output:
g u v i
 */

import java.util.Scanner;

public class GuviSplit
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String guvi = scan.next();

        for (int i = 0; i < guvi.length(); i++) {
            System.out.print(guvi.charAt(i));
            if (i != guvi.length() - 1)
            {
                System.out.print(" ");
            }
        }
        scan.close();
    }
}
