// Create a program to implement multiple interfaces in a single class

// First Interface
interface Printable
{
    void print();
}

// Second Interface
interface Scannable
{
    void scan();
}

//Class Implementing both interfaces
class MultiFunctionPrinter implements Printable, Scannable
{
    @Override
    public void print()
    {
        System.out.println("Printing Documents...");
    }

    @Override
    public void scan()
    {
        System.out.println("Scanning Documents...");
    }
}

public class MultiInterfaceDemo
{
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();

        mfp.scan();
        mfp.print();

    }
}