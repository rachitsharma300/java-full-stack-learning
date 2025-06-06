// Create a class hierarchy for Appliance using inheritance and polymorphism.

class Appliance
{
    String brand;

    Appliance(String brand)
    {
        this.brand = brand;
    }
    void run()
    {
        System.out.println("Appliance is running...");
    }
}

// Child Class 1
class Fan extends Appliance
{
    Fan(String brand)
    {
        super(brand);
    }

    @Override
    void run()
    {
        System.out.println(brand + " Fan is spinning...");
    }
}

// Child Class 2
class Refrigerator extends Appliance
{
    Refrigerator(String brand)
    {
        super(brand);
    }
    @Override
    void run()
    {
        System.out.println(brand +" Refrigerator is cooling...");
    }
}

public class ApplianceHierarchy
{
    public static void main(String[] args)
    {
        Appliance Ap = new Fan("Philips");
        Appliance Ap2 = new Refrigerator("LG");

        Ap.run();
        Ap2.run();
    }
}