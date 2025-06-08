//  Explain how to create multiple catch blocks and the importance of their order.

public class MultipleCatch
{
    public static void main(String [] args)
    {
        try
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // May cause ArrayIndexOutOfBoundException

            int result = 10 / 0; // cause ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is invalid!");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }
        catch (Exception e)
        {
            System.out.println("General exception caught!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
