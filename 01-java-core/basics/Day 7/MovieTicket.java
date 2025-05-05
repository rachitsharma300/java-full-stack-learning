/*
Movie Ticket Booking
🔹 Objective:
Practice method declaration types, static and local variables.
🔹 Requirements:
•	Create class MovieTicket.
•	Instance variables: movieName, seatNo, price.
•	Static variable: theaterName.
•	Constructor to initialize ticket details.
•	Method printTicket() to display details.
•	Method calculateTotal(int quantity) — use local variable to calculate total cost.
🔹 Input:
MovieTicket t1 = new MovieTicket("Jawan", "A5", 200);
t1.printTicket();
System.out.println("Total for 3 tickets:" + t1.calculateTotal(3));
🔹 Output:
Theater: PVR Cinemas
Movie: Jawan | Seat: A5 | Price: 200
Total for 3 tickets: 600
 */
class MovieTicket
{
    String movieName;
    String seatNo;
    double price;

    static String theaterName = "PVR Cinemas";

    MovieTicket(String movieName, String seatNo, double price)
    {
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.price = price;
    }

    void printTicket()
    {
        System.out.println("Theater Name " + theaterName );
        System.out.println("Movie Name - " + movieName + ", Seat No - " + seatNo + ", Price - " + price);
    }
    double calculateTotal(int quantity)
    {
        double total = price * quantity;
        return total;
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("3 Idiots", "A4", 500);
        t1.printTicket();
        System.out.println("Total for 3 Ticket Price " + t1.calculateTotal(3));
    }
}

