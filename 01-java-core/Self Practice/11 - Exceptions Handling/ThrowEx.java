// Write a program that throws an exception using throw keyword manually.

public class ThrowEx
{
        // Method to validate age for voting
        static void checkAge(int age)
        {
            if (age < 18)
            {
                // Manually throwing an ArtEx if age < 18
                throw new ArithmeticException("Not Eligible to vote, age must be 18 or above");
            }
            else
            {
                System.out.println("Eligible to Vote");
            }
        }

    public static void main(String[] args)
    {
        try
        {
            checkAge(16); // throw Exception
        }
        catch (ArithmeticException e)
        {
            System.err.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Programs continues after exception handling");
    }
    }
