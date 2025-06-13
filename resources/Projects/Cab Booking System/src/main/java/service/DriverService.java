/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverService
{
    // ===================== Encapsulation =====================
    // Maintains internal list of all drivers
    private List<Driver> drivers = new ArrayList<>();

    // ===================== Add a New Driver =====================
    // Adds driver to the list and prints confirmation

    public void addDriver(Driver driver)
    {
        drivers.add(driver);  // OOP: Encapsulation (modifying internal list)
        System.out.println("Driver added: " + driver);
    }

    // ===================== List All Drivers =====================
    // Prints all driver info using forEach and lambda expression
    public void listDrivers()
    {
        drivers.forEach(System.out::println); // Java 8+ Lambda (Method Reference)
    }

    // ===================== Search Driver by ID =====================
    // Returns Optional containing driver with matching ID
    // OOP: Abstraction (client code doesn’t need to know how driver is searched)
    public Optional<Driver> findDriverById(String driverId)
    {
        return drivers.stream()
                .filter(d -> d.getDriverId().equals(driverId)) // Lambda Ex..
                .findFirst();  // Optional to safely handle nulls
    }

    // Optional Feature for adding some extra features -->
    // ===================== Update Driver's Availability =====================
    // Updates driver's availability using Optional.ifPresentOrElse (Java 9+)
    public void updateDriverAvailability(String driverId, boolean isAvailable)
    {
        findDriverById(driverId).ifPresentOrElse(driver -> {
            driver.setAvailable(isAvailable);
            System.out.println("Driver " + driver.getName() + " availability updated to " + isAvailable);

        }, () -> System.out.println("Driver not found By ID: " + driverId));
    }

    // ===================== Get Available Drivers =====================
    // Returns list of all drivers whose availability is true
    public List<Driver> getAvailableDrivers()
    {
        return drivers.stream()
                .filter(Driver::isAvailable)  // method Reference java 8+
                .toList(); // Java 17 : collects stream into list
    }
}
