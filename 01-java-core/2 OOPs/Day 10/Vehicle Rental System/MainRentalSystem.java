// Main class to test the Vehicle Rental System

public class MainRentalSystem {
    public static void main(String[] args) {
        Vehicle v = new Car("Toyota", "Petrol");
        v.displayInfo();
        System.out.println("Rent: " + v.calculateRentalPrice(5));

        Maintainable m = (Maintainable) v;
        m.serviceSchedule();

        // You can test other vehicle types too:
        System.out.println();

        Vehicle b = new Bike("Honda", "Petrol");
        b.displayInfo();
        System.out.println("Rent: " + b.calculateRentalPrice(3));
        ((Maintainable) b).serviceSchedule();

        System.out.println();

        Vehicle t = new Truck("Tata", "Diesel");
        t.displayInfo();
        System.out.println("Rent: " + t.calculateRentalPrice(2));
        ((Maintainable) t).serviceSchedule();
    }
}
