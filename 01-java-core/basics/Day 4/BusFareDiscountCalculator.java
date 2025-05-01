/*
Bus Fare Discount Calculator
Take age and number of trips from user input. For each trip, apply the following fare rules:
•	Age < 5 or > 60: 50% discount
•	Else: full fare
Input:
Enter age: 45
Enter number of trips: 3
Trip 1 fare: 20
Trip 2 fare: 30
Trip 3 fare: 25

Output:
Total after discount: 75
 */
import java.util.Scanner;
public class BusFareDiscountCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scan.nextInt();

        double totalFare = 0;

        System.out.println("Enter your trip plan :");
        int trip = scan.nextInt();

        for (int i = 1; i <= trip; i ++)
        {
            System.out.println("Trip" + i + "fare :");
            double fare = scan.nextDouble();

            if (age < 5 || age < 60 )
            {
                fare *= 0.5; // 50% Discount if applicable
            }
            totalFare += fare;
        }
        System.out.println("Total after discount: " + (int)totalFare);
        scan.close();
    }
}
