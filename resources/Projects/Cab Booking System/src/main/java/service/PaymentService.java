/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================*/

public class PaymentService
{
    private static final double BASE_FARE = 50.0;   // Base Charge
    private static final double PER_KM_RATE = 10.0;  // Per Kilometer rate

    // Generate Bill for a ride
//    public void generateBill(Rider rider, Driver driver, double distanceInKm)
//    {
//        double totalFare = BASE_FARE + (distanceInKm * PER_KM_RATE);
//
//        System.out.println("============== Payment Receipt ==============");
//        System.out.println("Rider Name   : " + rider.getName());
//        System.out.println("Driver Name  : " + driver.getName());
//        System.out.println("Distance     : " + distanceInKm + " km");
//        System.out.println("Total Fare   : ₹" + totalFare);
//        System.out.println("=============================================");
//    }

    // Simulate payment processing
    public void processPayment(Rider rider, double amount, String paymentMethod)
    {
        System.out.println("\nProcessing payment...");
        System.out.println("Rider Name       : " + rider.getName());
        System.out.println("Payment Method   : " + paymentMethod);
        System.out.println("Amount Paid      : ₹" + amount);
        System.out.println("Payment Status   : SUCCESS");
    }

}
