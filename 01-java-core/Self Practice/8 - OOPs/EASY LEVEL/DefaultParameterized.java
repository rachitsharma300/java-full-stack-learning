// Write a program that uses default and parameterized constructors

class CarInfo
{
    String brnad;
    String model;
    double price;

    //Default Constructor
    CarInfo()
    {
        brnad = "TaTa";
        model = "Thar";
        price = 1900000;
    }

    // Parameterized Constructor
    CarInfo(String brnad, String model, double price)
    {
        this.brnad = brnad;
        this.model = model;
        this.price = price;
    }

    // Method to Display CarInfo
    void displayInfo()
    {
        System.out.println("Brand : " + brnad);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("--------------------------------");
    }
}

public class DefaultParameterized {
    public static void main(String[] args) {
        // Using Default Const..
        CarInfo car1 = new CarInfo();
        System.out.println("Default Constructor:");
        car1.displayInfo();

        // Using Parameterized Const..
        CarInfo car2 = new CarInfo("Honda", "City", 1200000);
        System.out.println("Parameterized Constructor");
        car2.displayInfo();
    }
}