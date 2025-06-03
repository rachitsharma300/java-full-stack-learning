import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter source: ");
        String source = scan.nextLine();

        System.out.println("Enter destination: ");
        String destination = scan.nextLine();

        TravelBookingService bookingService = new TravelBookingService();
        bookingService.bookTrip(source, destination);

        // Keep JVM Alive Until async tasks complete
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
