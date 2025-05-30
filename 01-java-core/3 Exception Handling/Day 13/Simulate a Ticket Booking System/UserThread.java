public class UserThread implements Runnable
{
    private String userName;
    private int numberOfTickets;
    private TicketCounter ticketCounter;

    public UserThread(String userName, int numberOfTickets, TicketCounter ticketCounter)
    {
        this.userName = userName;
        this.numberOfTickets = numberOfTickets;
        this.ticketCounter = ticketCounter;
    }

    @Override
    public void run()
    {
        ticketCounter.bookTicket(userName, numberOfTickets);
    }
}
