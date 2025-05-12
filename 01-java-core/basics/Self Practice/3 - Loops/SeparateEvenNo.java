/*
Write a code to get an integer N and print the even values from 1 till N in a separate line.

    Input Description:
    A single line contains an integer N.

    Output Description:
    Print the even values from 1 to N in a separate line.

    Sample Input :
    6
    Sample Output :
    2
    6
    4
 */
import java.util.Scanner;

public class SeparateEvenNo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 2; i <= num; i += 2)
        {
            System.out.println(i);
        }
        scan.close();
    }
}
