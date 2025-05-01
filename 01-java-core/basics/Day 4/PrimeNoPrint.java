/*
 Write a program to print prime numbers from 1 to N
Input:
Enter N: 10
Output:
2,3,5,7
 */
import java.util.Scanner;

public class PrimeNoPrint
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        for (int i = 2; i <= num; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
