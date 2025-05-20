// Abstract class Vehicle to define common properties and behaviors

abstract class Vehicle {
    String brand;
    String fuelType;

    Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Vehicle: " + brand + " | Fuel: " + fuelType);
    }

    abstract int calculateRentalPrice(int days);
}
