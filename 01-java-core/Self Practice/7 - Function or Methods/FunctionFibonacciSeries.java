// Function to print Fibonacci series

public class FunctionFibonacciSeries
{
    public static void printFibonacci(int count)
    {
        int a = 0;
        int b = 1;

        System.out.println(a + " " + b);

        for (int i = 2; i < count; i++)
        {
            int next = a + b;
            System.out.println(" " + next);
            a = b;
            b = next;
        }
    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Fibonacci Series uo to " + n + " terms: ");
        printFibonacci(n);
    }
}
