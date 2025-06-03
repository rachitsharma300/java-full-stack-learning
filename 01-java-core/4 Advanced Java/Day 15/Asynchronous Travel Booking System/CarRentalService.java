import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CarRentalService
{
    public CompletableFuture<String> searchCars(String destination)
    {
        return CompletableFuture.supplyAsync(() -> {
           simulateDelay("CarRentalService");
           return "[CarRentalService] Found: Renault Scenic";
        });
    }

    private void simulateDelay(String service)
    {
        System.out.println("[" + service + "] searching for car rentals...");
        try
        {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
