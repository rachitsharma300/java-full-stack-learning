/*
Write a code, get an integer number as input and print the sum of the digits.

Input Description:
A single line containing an integer.

Output Description:
Print the sum of the digits of the integer.

Sample Input:
124
Sample Output:
7
S*/

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        num = Math.abs(num);
        int sum = 0;

        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
        scan.close();
    }
}
