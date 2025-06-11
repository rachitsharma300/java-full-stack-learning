/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/

public class Cab
{
    private String cabId;
    private String driverName;
    private String location;
    private boolean isAvailable;

    public Cab(String cabId, String driverName, String location, boolean isAvailable)
    {
        this.cabId = cabId;
        this.driverName = driverName;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    // Getter
    public String getCabId() { return cabId; }
    public  String getDriverName() { return driverName; }
    public  String getLocation() { return  location; }
    public  boolean isAvailable() { return  isAvailable; }

    // Setter
    public void setLocation(String location) { this.location = location; }
    public void setAvailable(boolean available) { isAvailable = available; }

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
