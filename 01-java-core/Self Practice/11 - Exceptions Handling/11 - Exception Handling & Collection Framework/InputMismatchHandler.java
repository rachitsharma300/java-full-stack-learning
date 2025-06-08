// Write a method that reads integer input from user and handles InputMismatchException.

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchHandler
{
    // Method to read integer input safely
    public static void readIntegerInput()
    {
        Scanner scan = new Scanner(System.in);
        int number;

        try
        {
            System.out.println("Enter an integer");
            number = scan.nextInt(); // risky line
            System.out.println("You entered: " + number);
        }
        catch (InputMismatchException e)
        {
            System.err.println("Invalid input! Please enter a valid integer.");
        }
        finally
        {
            scan.close(); // Imp to avoid resource leak
        }
    }

    public static void main(String[] args)
    {
        readIntegerInput();
    }
}
