// Function to find factorial
import java.util.Scanner;

public class FunctionFindFactorial
{
    public static long findFactorial(int n)
    {
        long fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number to find Factorial :");
        int number = scan.nextInt();
        System.out.println("Factorial of " + number + " is : " + findFactorial(number));

        scan.close();
    }
}
