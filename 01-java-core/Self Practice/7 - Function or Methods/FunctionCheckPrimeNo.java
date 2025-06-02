//Function to check prime number

import java.util.Scanner;

public class FunctionCheckPrimeNo
{
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to Check Prime or Not :");
        int number = scan.nextInt();
        if (isPrime(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        scan.close();
    }
}
