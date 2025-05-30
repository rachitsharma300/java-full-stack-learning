public class TicketCounter
{
    private int availableSeats;

    public TicketCounter(int totalSeats)
    {
        this.availableSeats = totalSeats;
    }

    public synchronized void bookTicket(String userName, int numberOfTickets)
    {
        System.out.println("[" + userName + "] trying to book " + numberOfTickets + " ticket(s)...");

        if (numberOfTickets <= availableSeats)
        {
            System.out.println("[" + userName + "] successfully booked " + numberOfTickets + " ticket(s). Remaining: " + (availableSeats - numberOfTickets));
            availableSeats -= numberOfTickets;
        }
        else
        {
            System.out.println("[" + userName + "] failed to book. Not enough seats.");
        }
    }
}
