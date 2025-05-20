// Car class extending Vehicle and implementing Maintainable

class Car extends Vehicle implements Maintainable {

    Car(String brand, String fuelType) {
        super(brand, fuelType);
    }

    @Override
    int calculateRentalPrice(int days) {
        return days * 500;  // Rs. 500 per day
    }

    @Override
    public void serviceSchedule() {
        System.out.println("Car service every 5000 km or 6 months");
    }
}
