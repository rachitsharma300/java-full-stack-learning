// Bike class with its own rental logic and maintenance

class Bike extends Vehicle implements Maintainable {

    Bike(String brand, String fuelType) {
        super(brand, fuelType);
    }

    @Override
    int calculateRentalPrice(int days) {
        return days * 200;  // Rs. 200 per day
    }

    @Override
    public void serviceSchedule() {
        System.out.println("Bike service every 3000 km or 3 months");
    }
}
