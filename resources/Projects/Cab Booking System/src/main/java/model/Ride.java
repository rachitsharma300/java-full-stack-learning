/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/

public class Ride
{
    private String userId;
    private String name;
    private String phoneNumber;
    private String email;

    public Ride(String userId, String name, String phoneNumber, String email)
    {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public  String getEmail() { return email; }

    // Setter
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber; }
    public void setEmail(String email) {this.email =email; }

    @Override
    public String toString()
    {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
