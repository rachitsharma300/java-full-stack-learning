interface MyInterface
{
    // Default method
    default void show()
    {
        System.out.println("Default method in interface");
    }

    // Static method
    static void display()
    {
        System.out.println("Static method in interface");
    }
}

class Myclass implements MyInterface
{
    // Can override default method if needed
    @Override
    public void show()
    {
        System.out.println("Overridden default method in class");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Myclass obj = new Myclass();
        obj.show(); // Calls overridden default method

        MyInterface.display(); // Calls static method via interface name
    }
}
