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

    // List all driver
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
}
