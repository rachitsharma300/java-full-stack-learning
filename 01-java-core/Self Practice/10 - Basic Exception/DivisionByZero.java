/*
Division by Zero (ArithmeticException)
Write a program to divide two numbers. Handle the case when the denominator is zero using try-catch.
 */

import java.util.Scanner;

public class DivisionByZero
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            System.out.println("Enter Numerator: ");
            int numerator = scan.nextInt();

            System.out.println("Enter Denominator: ");
            int denominator = scan.nextInt();

            int result = numerator / denominator;
            System.out.println("Result :" + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannont divide by Zero");
        }
        scan.close();
    }
}
