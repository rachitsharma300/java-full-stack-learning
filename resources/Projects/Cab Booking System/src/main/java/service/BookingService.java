/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/


import java.util.List;

public class BookingService
{
    private DriverService driverService;
    public BookingService(DriverService driverService)
    {
        this.driverService = driverService;
    }

    // Book a ride for a rider
    public void bookCab(Rider rider)
    {
        List<Driver> availabeDrivers = driverService.getAvailableDrivers();

        if (availabeDrivers.isEmpty())
        {
            System.out.println("No Cabs available at the moment.");
            return;
        }

        Driver driver = availabeDrivers.get(0); // Simple selection logic (first available)
        driver.setAvailable(false); // Mark driver as busy

        System.out.println("Ride booked for " + rider.getName() + " with driver " + driver.getName());
    }
}
