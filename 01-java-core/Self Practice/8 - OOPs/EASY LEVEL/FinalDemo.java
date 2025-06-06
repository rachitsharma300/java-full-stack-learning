// Demonstrate final keyword usage with variable, method, and class

class Shape
{
    // Final Variable
    final double PI = 3.14159;

    // Final Method
    final void displayPi()
    {
        System.out.println("Value of PI: " + PI);
    }
}

// Trying to extends a final class will cause error

public class FinalDemo
{
    public static void main(String[] args)
    {
        Shape s = new Shape();

        // Access final variable and method
        s.displayPi();
    }
}
