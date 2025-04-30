/*
1. Parking Lot Slot Finder (break)
Scenario: Ask the user to enter the status of 10 parking slots (1 for occupied, 0 for available).
Reserve the first available slot and stop checking further.
Sample Input:
Enter slot status (0 = available, 1 = occupied):
1 1 0 1 0 1 1 1 1 1
Expected Output:
Reserving slot #3

 */
import java.util.Scanner;
public class ParkingLotSlotFinder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] slots = new int[10];

        System.out.println("Enter Slot Status (0 = Available, 1 = Occupied):");


        for (int i=0; i < 10; i++)
        {
            slots[i] = scan.nextInt();
        }

        boolean reversed = false;

        for (int i = 0; i < 10; i ++)
        {
            if (slots[i] == 0 )
            {
                System.out.println("Reserving Slot :" + (i+1));
                reversed = true;
                break;
            }
        }
        if (!reversed)
        {
            System.out.println("All slots are occupied!");
        }
        scan.close();
    }
}
