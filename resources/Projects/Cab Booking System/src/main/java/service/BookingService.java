/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/


import java.util.List;

public class BookingService
{
    // ===================== Encapsulated Field =====================
    private DriverService driverService;

    // ===================== Constructor Injection =====================
    // OOPs Pillar Used: Abstraction & Dependency Injection
    // Injects DriverService to decouple responsibilities and promote modular design
    public BookingService(DriverService driverService)
    {
        this.driverService = driverService;
    }

    // ===================== Core Business Logic =====================
    // Method to book a cab for a given rider
    public void bookCab(Rider rider)
    {
        // Fetch all available drivers
        List<Driver> availabeDrivers = driverService.getAvailableDrivers();

        // If no drivers available, inform the rider
        if (availabeDrivers.isEmpty())
        {
            System.out.println("No Cabs available at the moment.");
            return;
        }

        // Simple logic to choose the first available driver
        Driver driver = availabeDrivers.get(0); // Simple selection logic (first available)

        // Mark that driver as no longer available
        driver.setAvailable(false); // OOPs: Encapsulation (field changed via setter method)

        // Confirm the booking
        System.out.println("Ride booked for " + rider.getName() + " with driver " + driver.getName());
    }
}
