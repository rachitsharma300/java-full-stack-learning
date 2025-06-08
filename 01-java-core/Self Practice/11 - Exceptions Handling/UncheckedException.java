// What happens if exception is not caught? Demonstrate unchecked exception behavior.

public class UncheckedException
{
    public static void main(String[] args)
    {
        // this will throw an ArithmeticException
        int result = 10 / 0;

        System.out.println("Result: " + result); // this won't be executed

        System.out.println("Program Ended.");
    }
}
