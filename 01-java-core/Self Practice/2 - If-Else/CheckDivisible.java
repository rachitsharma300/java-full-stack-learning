//Check if a number is divisible by 5 and 11

import java.util.Scanner;

public class CheckDivisible
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

         System.out.print("Enter a number: ");
        int num = scan.nextInt();

        // Check divisibility
        if (num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num + " is divisible by both 5 and 11.");
        }
        else
        {
            System.out.println(num + " is NOT divisible by both 5 and 11.");
        }

        scan.close();
    }
}
