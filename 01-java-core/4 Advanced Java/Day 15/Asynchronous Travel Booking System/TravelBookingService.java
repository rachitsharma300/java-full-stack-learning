import java.util.concurrent.CompletableFuture;

public class TravelBookingService
{
    private FlightService flightService = new FlightService();
    private  HotelService hotelService = new HotelService();
    private CarRentalService carRentalService = new CarRentalService();

    public void bookTrip(String source, String destination)
    {
        System.out.println("Booking trip from " + source + " to " + destination + "...");

        CompletableFuture<String> flightfuture = flightService.searchFlights(source, destination)
                .exceptionally(ex -> "[FlightService] Flight booking failed");

        CompletableFuture<String> hotelFuture = hotelService.searchHotels(destination)
                .exceptionally(ex -> "[HotelService] Hotel booking failed");

        CompletableFuture<String> carFuture = carRentalService.searchCars(destination)
                .exceptionally(ex -> "[CarRentalService] Car rental failed");


        CompletableFuture<Void> allBookings = CompletableFuture.allOf(flightfuture, hotelFuture, carFuture);

        allBookings.thenAccept(v -> {
            try
            {
                String flight = flightfuture.get();
                String hotel = hotelFuture.get();
                String car = carFuture.get();

                System.out.println("\nTrip Summary:");
                System.out.println("Flight: " + flight.split("Found: ")[1]);
                System.out.println("Hotel: " + hotel.split("Found: ")[1]);
                System.out.println("Car Rental: " + car.split("Found: ")[1]);
                System.out.println("\nBooking completed successfully!");
            }
            catch (Exception e)
            {
                System.out.println("Error in booking: " + e.getMessage());
            }
        });
    }
}
