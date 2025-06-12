/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/
public class Driver
{
    private String driverId;
    private String name;
    private String  phoneNumber;
    private String licenseNumber;
    private boolean available;

    public Driver(String driverId, String name, String phoneNumber, String licenseNumber, boolean available)

    {
        this.driverId = driverId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.available = available;
    }

    // Getter
    public String getDriverId() { return driverId; }
    public String getName() { return  name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getLicenseNumber() { return licenseNumber; }
    public boolean isAvailable() { return available; }

    // Setter
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString()
    {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", available" + available +
                '}';
    }
}
