// Create a class Car with properties like model, brand, and price. Create and print object data.

class ClassProperties
{
    String carBrand;
    String carModel;
    double carPrice;

    // Constructor
    ClassProperties(String carBrand, String carModel, double carPrice)
    {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    // Method to display car info
    void displayCarInfo()
    {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Price: ₹ " + carPrice);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Creating Car Objects
        ClassProperties car1 = new ClassProperties("City", "Honda", 1200000);
        ClassProperties car2 = new ClassProperties("Swift", "Maruti", 750000);
        ClassProperties car3 = new ClassProperties("Thar", "Mahindra", 2200000);

        // Displaying Car Info
        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();
    }
}
