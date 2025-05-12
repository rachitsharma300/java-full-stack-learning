/*
Write a program to get a list of integers as input and find the LCM of the values without using GCD

    Input Description:
    First line contains an integer N, number of values. Second line contains N space separated values.

    Output Description:
    Print the LCM of the values.

    Sample Input:
    1 2 3 4 5
    Sample Output:
    60
*/
import java.util.Scanner;

public class LcmWithoutGcd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Number of integers
        int[] arr = new int[n];

        // Read the list of numbers
        for (int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        int lcm = arr[0];

        for (int i = 1; i < n; i++)
        {
            lcm = findLCM(lcm, arr[i]);
        }

        System.out.println(lcm);
        scan.close();
    }

    // Brute-force LCM finder without using GCD
    static int findLCM(int a, int b)
    {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0)
            {
                return max;
            }
            max++;
        }
    }
}
