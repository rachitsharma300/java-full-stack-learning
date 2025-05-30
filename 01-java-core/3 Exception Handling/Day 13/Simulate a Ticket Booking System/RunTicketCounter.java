import java.util.Random;

public class RunTicketCounter
{
        public static void main(String[] args) {
            TicketCounter counter = new TicketCounter(10);
            Random random = new Random();

            for (int i = 1; i <= 5; i++) {
                String userName = "User-" + i;
                int requestedTickets = random.nextInt(4) + 1; // Random number between 1 and 4
                Thread userThread = new Thread(new UserThread(userName, requestedTickets, counter));
                userThread.start();
            }
        }
    }