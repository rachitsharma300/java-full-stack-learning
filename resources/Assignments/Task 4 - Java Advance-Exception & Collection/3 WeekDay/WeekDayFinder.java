import java.util.Scanner;

public class WeekDayFinder
{
    public static void main(String[] args)
    {
        // Array of weekday start from Sunday indx 0
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);

        try
        {
            // Ask user for day index
            System.out.print("Enter day position (0 for Sunday to 6 for Saturday): ");
            int index = sc.nextInt();

            // Try to access the day from array
            System.out.println("Day at position " + index + " is: " + weekdays[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            // If index is not between 0 to 6
            System.out.println("Error: Invalid day index! Please enter a number between 0 and 6.");
        }

        sc.close();
    }
}

/*
|______________________________________________________________________________________________________________________|
|                                                     OUTPUT                                                           |
|______________________________________________________________________________________________________________________|
|                                    ----- VALID INPUT -----                                                           |
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|                   Enter day position (0 for Sunday to 6 for Saturday): 2                                             |
|                   Day at position 2 is: Tuesday                                                                      |
|______________________________________________________________________________________________________________________|
|                                   _____ INVALID INPUT -----                                                                           |
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|                   Enter day position (0 for Sunday to 6 for Saturday): 8                                             |
|                   Error: Invalid day index! Please enter a number between 0 and 6.                                   |                                                                                                                     |
|______________________________________________________________________________________________________________________|

 */
