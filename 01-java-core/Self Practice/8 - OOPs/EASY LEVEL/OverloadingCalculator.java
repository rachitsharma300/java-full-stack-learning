// Show method overloading in a Calculator class

public class OverloadingCalculator
{
    // Add Two Int
    int add(int a, int b)
    {
        return a + b;
    }
    // Add Three Int
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // Add Two double values
    double add(double a, double b)
    {
        return a + b;
    }

    // Concatenate two Strings  ( Overloading with different data type )
    String add(String a, String b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        OverloadingCalculator OvrCal = new OverloadingCalculator();

        System.out.println("Add int: " + OvrCal.add(5, 10));                        // 15
        System.out.println("Add int (3 args): " + OvrCal.add(5, 10, 15));       // 30
        System.out.println("Add Double: " + OvrCal.add(5.5, 3.2));                 // 8.8
        System.out.println("Add Strings: " + OvrCal.add("Hello ", "Rachit"));     // Hello Rachit
    }
}
