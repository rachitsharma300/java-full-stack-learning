/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================ */

public class DistanceCalculator
{
    // Dummy implementation - In real case, would use geo-coordinates or map API
    public static double calculateDistance(String pickupLocation, String dropLocation)
    {
        // Just simulate some dummy distance logic
        if (pickupLocation.equalsIgnoreCase(dropLocation))
            return 1.0;

        return Math.random() * 10 + 1; // random distance between 1 and 10 km
    }
}
