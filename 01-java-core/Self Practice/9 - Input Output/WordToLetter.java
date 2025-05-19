/*
Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by line.

Sample Input:
guvigeek
Sample Output:
g
u
v
i
g
e
e
k
*/


import java.util.Scanner;

public class WordToLetter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        for (char ch : word.toCharArray())
        {
            System.out.println(ch);
        }
        scan.close();
    }
}
