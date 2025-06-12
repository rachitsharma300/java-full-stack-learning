/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverService
{
    private List<Driver> drivers = new ArrayList<>();

    // Add a new Driver
    public void addDriver(Driver driver)
    {
        drivers.add(driver);
        System.out.println("Driver added: " + driver);
    }

    // List all drivers
    public void listDrivers()
    {
        drivers.forEach(System.out::println); // Lambda use here
    }

    // Find a Driver by ID
    public Optional<Driver> findDriverById(String driverId)
    {
        return drivers.stream()
                .filter(d -> d.getDriverId().equals(driverId)) // Lambda
                .findFirst();
    }

    // Optional Feature for adding some extra features -->

    // Update driver's availability
    public void updateDriverAvailability(String driverId, boolean isAvailable)
    {
        findDriverById(driverId).ifPresentOrElse(driver -> {
            driver.setAvailable(isAvailable);
            System.out.println("Driver " + driver.getName() + " availability updated to " + isAvailable);

        }, () -> System.out.println("Driver not found By ID: " + driverId));
    }

    // Get list of available drivers
    public List<Driver> getAvailableDrivers()
    {
        return drivers.stream()
                .filter(Driver::isAvailable)  // method Reference
                .toList(); // Java 17
    }
}
