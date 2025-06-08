public class DivisionEx
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0; // Divisor is zero -- cause of ArithmeticException

        try {
            int result = a / b;  // Risky Op - / by 0
        } catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by Zero!");
        }
        System.out.println("Program Continues...");
    }
}
