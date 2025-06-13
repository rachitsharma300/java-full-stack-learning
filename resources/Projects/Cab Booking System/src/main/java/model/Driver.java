/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/
public class Driver
{
    // ===================== Encapsulated Fields =====================
    private String driverId;         // Unique identifier for the driver
    private String name;             // Name of the driver
    private String phoneNumber;      // Contact number of the driver
    private String licenseNumber;    // Driver's license number
    private boolean available;       // Availability status for ride assignments

    // ===================== Constructor =============================
    // Initializes a Driver object with given attributes
    public Driver(String driverId, String name, String phoneNumber, String licenseNumber, boolean available)
    {
        this.driverId = driverId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.available = true; // Default Value
    }

    // ===================== Getters (Accessors) =====================
    // OOPs Pillar Used: Encapsulation — Providing controlled access to private data
    public String getDriverId() { return driverId; }
    public String getName() { return  name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getLicenseNumber() { return licenseNumber; }
    public boolean isAvailable() { return available; }

    // ===================== Setters (Mutators) =====================
    // Used to update mutable fields like phone and availability status
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAvailable(boolean available) { this.available = available; }

    // ===================== toString Method =====================
    // Returns a string representation of the Driver object
    @Override
    public String toString()
    {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", available=" + available +
                '}';
    }
}
