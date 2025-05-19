/*
Website Visitor Tracker
Track the number of visitors on a website for 7 days. Find on which days the traffic was below average.

Input:
int[] visitors = {300, 500, 400, 450, 600, 200, 350};

Expected Output:
Average Visitors: 400.0
Days with below average traffic: Day 1, Day 6, Day 7
 */
import java.util.Scanner;

public class websiteVisitorTracker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] data = new int[7];

        int sum = 0;
        double average;

        System.out.println("Enter Visitors Data :");
        for (int i = 0; i<7; i++)
        {
            data[i] = scan.nextInt();
            sum += data[i];
        }
        average = sum / 7.0;

        System.out.println("Average Visitors: " + average);
        System.out.print("Days with below average traffic: ");

        for (int i = 0; i < 7; i++)
        {
            if (data[i] < average)
            {
                System.out.print("Day " + (i + 1));
                if (i != 6)
                {
                    System.out.print(", ");
                }
            }
        }
    }
}
