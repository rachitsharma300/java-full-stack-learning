/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================ */

public class MainApp
{
    public static void main(String[] args)
    {
        // Initialize services
        DriverService driverService = new DriverService();
        BookingService bookingService = new BookingService(driverService);
        PaymentService paymentService = new PaymentService();

        // Create drivers (ID, Name, LicenseNumber, Availability)
        Driver driver1 = new Driver("D001", "Raj", "9871004141", "BR02CD5678", true);
        Driver driver2 = new Driver("D002", "Simran", "9546183930", "MH02CD5678", true);
        driverService.addDriver(driver1);
        driverService.addDriver(driver2);

        // Create a rider (UserID, Name, PhoneNumber)
        Rider rider = new Rider("R001", "Rachit", "9876543210", "Rachitsharma300@gmail.com");

        // Book a cab
        bookingService.bookCab(rider);

        // Simulate payment
        paymentService.processPayment(rider, 250.0, "UPI");

        // Show remaining available drivers
        System.out.println("\nAvailable drivers after booking:");
        driverService.getAvailableDrivers().forEach(System.out::println);
    }
}
