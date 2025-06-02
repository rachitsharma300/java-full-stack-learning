// Function overloading example

public class OverloadingExample
{
    // Add two int
    public static int add(int a, int b) {return a + b;}

    // Add three int
    public static int add(int a, int b, int c) {return a + b + c;}

    // Add two double Values
    public static double add(double a, double b) {return a + b;}

    public static void main(String[] args)
    {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add (2, 3, 4) = " + add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
    }
}

