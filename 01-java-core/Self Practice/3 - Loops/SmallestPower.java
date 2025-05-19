/*
Write a code to get an integer n as input and calculate the smallest perfect power of 2 greater than n.

    Input Description:
    A single line containing an integer, n.

    Output Description:
    Print the smallest perfect power of 2 greater than n.

    Sample Input:
    48
    Sample Output:
    64

 */


import java.util.Scanner;

public class SmallestPower
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int power = 0;
        int result = 1;

        while (result <= num)
        {
            power++;
           // result = (int) Math.pow(2, power);
             result = result * 2;
        }
        System.out.println(result);
        scan.close();
    }
}
