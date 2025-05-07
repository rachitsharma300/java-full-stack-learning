/*
Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by comma.

Sample Input:
guvi
Sample Output:
g,u,v,i
 */

import java.util.Scanner;

public class AddCommaEachWord
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++)
        {
            System.out.print(word.charAt(i));
            if (i != word.length() - 1)
            {
                System.out.print(",");
            }
        }
        scan.close();
    }
}
