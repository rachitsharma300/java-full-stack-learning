import java.util.Scanner;
public class Fuel_Consumption
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Days : ");

        int No_Days = scan.nextInt();

        int[] fuel = new int[No_Days];
        int totalFuel = 0;

        for (int i = 0; i < fuel.length; i++)
        {
            System.out.print("Enter fuel consumed on day " + (i + 1) + ": ");
            fuel[i] = scan.nextInt();
            totalFuel += fuel[i];
        }

        double average = (double) totalFuel / No_Days;

        System.out.println("\nTotal fuel consumed: " + totalFuel + " liters");
        System.out.println("Average fuel consumption per day: " + average + " liters");

        scan.close();

    }
}
