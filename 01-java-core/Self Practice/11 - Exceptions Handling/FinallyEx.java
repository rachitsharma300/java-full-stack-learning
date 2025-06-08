public class FinallyEx
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside try Block");
            int result = 10 / 0; // throw ArEx e
            System.out.println("Result: " + result); // Won't execute
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught: Division by Zero.");
        }
        finally
        {
            // this block always executes regardless of exception
            System.out.println("Finally block executed: Cleaning up resources.");
        }
        System.out.println("Programs continues after try-catch-finally.");
    }
}
