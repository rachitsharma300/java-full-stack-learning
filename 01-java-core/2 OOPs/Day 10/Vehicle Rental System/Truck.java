// Truck class with higher rental cost and different service logic

class Truck extends Vehicle implements Maintainable {

    Truck(String brand, String fuelType) {
        super(brand, fuelType);
    }

    @Override
    int calculateRentalPrice(int days) {
        return days * 1000;  // Rs. 1000 per day
    }

    @Override
    public void serviceSchedule() {
        System.out.println("Truck service every 10000 km or 12 months");
    }
}
