/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/

public class Rider
{
    // ===================== Encapsulated Fields =====================
    private String userId;           // Unique identifier for the rider (user)
    private String name;            // Name of the rider
    private String phoneNumber;     // Contact number
    private String email;           // Email address

    // ===================== Constructor =============================
    // Initializes a Rider object with required user details
    public Rider(String userId, String name, String phoneNumber, String email)
    {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // ===================== Getters (Accessors) =====================
    // OOPs Pillar Used: Encapsulation — Fields are private, accessed via public methods
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public  String getEmail() { return email; }

    // ===================== Setters (Mutators) =====================
    // Allow controlled updates to mutable fields
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber; }
    public void setEmail(String email) {this.email =email; }

    // ===================== toString Method =====================
    // Returns a formatted string representation of the Rider object
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
