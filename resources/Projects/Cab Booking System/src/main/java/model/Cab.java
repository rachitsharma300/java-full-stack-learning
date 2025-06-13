/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/

public class Cab
{
    // ===================== Encapsulated fields =====================
    private String cabId;             // Unique identifier for the cab
    private String driverName;       // Name of the driver operating the cab
    private String location;         // Current location of the cab
    private boolean isAvailable;     // Availability status of the cab (true = available)

    // ===================== Constructor =============================
    // Initializes a Cab object with given details
    public Cab(String cabId, String driverName, String location, boolean isAvailable)
    {
        this.cabId = cabId;
        this.driverName = driverName;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    // ===================== Getters (Accessors) =====================
    // OOPs Pillar Used: Encapsulation — Private variables accessed via public getters
    public String getCabId() { return cabId; }
    public  String getDriverName() { return driverName; }
    public  String getLocation() { return  location; }
    public  boolean isAvailable() { return  isAvailable; }

    // ===================== Setters (Mutators) =====================
    // Allows modification of certain fields while keeping others safe
    public void setLocation(String location) { this.location = location; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // ===================== toString Method =====================
    // Provides a string representation of the Cab object
    @Override
    public String toString()
    {
        return "Cab{" +
                "cabId='" + cabId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", location='" + location + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
