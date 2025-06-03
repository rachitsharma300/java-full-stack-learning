import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class FlightService
{
    public CompletableFuture<String> searchFlights(String source, String destination)
    {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay("FlightService");
            return "[FlightService] Found: Delta Airlines DL123";
        });
    }

    private void simulateDelay(String service)
    {
        System.out.println("[" + service + "] Searching for flights...");
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
