import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class HotelService
{
    public CompletableFuture<String> searchHotels(String destination)
    {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay("HostelService");
            return "[HotelService] Found: Marriott Champs Elysees";
        });
    }

    private void simulateDelay(String service)
    {
        System.out.println("[" + service + "] searching for hotels...");
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
