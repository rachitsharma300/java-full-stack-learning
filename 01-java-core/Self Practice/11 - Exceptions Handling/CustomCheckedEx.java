//  Write a custom checked exception class and throw it in a method.

class AgeVerificationException extends Exception
{
    public AgeVerificationException(String message)
    {
        super(message); // call parent constructor
    }
}

public class CustomCheckedEx
{
    // Method to verify if age is valid, must 18+
    public static void verifyAge(int age) throws AgeVerificationException
    {
        if (age < 18)
        {
            // Throwing custom checked exception
            throw new AgeVerificationException("Access Denied: Age must be 18 or above.");
        }
        else
        {
            System.out.println("Access Granted: You are eligible.");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            verifyAge(16); // Throw exception
        }
        catch (AgeVerificationException e)
        {
            System.err.println("Exception Caught: " + e.getMessage());
        }
    }
}
