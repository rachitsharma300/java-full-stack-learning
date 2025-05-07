/*
Write a code to get the input in the given format and print the output in the given format

Input Description:
First-line indicates two integers separated by space. Second-line indicates three integers separated by space.
Third-line indicates three integers separated by space

Output Description:
Print the input in the same format.

Sample Input:
2 5
2 5 6
2 4 5
Sample Output:
2 5
2 5 6
2 4 5
*/


import java.util.Scanner;

public class RandomPrint
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int f = scan.nextInt();
        int g = scan.nextInt();
        int h = scan.nextInt();

        System.out.println(a + " " + b);
        System.out.println(c + " " + d + " " + e);
        System.out.println(f + " " + g + " " + h);
        scan.close();
    }
}
