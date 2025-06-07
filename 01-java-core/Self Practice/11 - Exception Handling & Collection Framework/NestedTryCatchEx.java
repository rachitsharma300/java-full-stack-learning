// Write nested try-catch blocks to handle multiple exceptions
// (e.g., ArrayIndexOutOfBoundsException and NullPointerException).

public class NestedTryCatchEx
{
    public static void main(String[] args)
    {
        //Outer try block
        try
        {
            System.out.println("Starting outer try block...");

            // Inner try block to handle ArrayIndexOutOfBoundException
            try
            {
                int[] numbers = {1, 2, 3};
                System.out.println("Accessing index 5; " + numbers[5]); // throw Exception
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Inner Catch: Array index out of bounds - " + e.getMessage());
            }

            // Another risky operation in outer try block
            String text = null;
            System.out.println("Text length: " + text.length()); // Throw NullPointerException
        }
        catch (NullPointerException e)
        {
            System.err.println("Outer catch: Null pointer encountered - " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
