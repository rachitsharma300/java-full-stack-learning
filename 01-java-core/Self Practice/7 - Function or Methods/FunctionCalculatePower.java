// Function to calculate power (x^y)

public class FunctionCalculatePower
{
    public static long power(int x , int y)
    {
        if (y == 0)
            return 1;
        return x * power(x,  y - 1);
    }

    public static void main(String[] args) {
        int base = 3, exponent = 4;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
