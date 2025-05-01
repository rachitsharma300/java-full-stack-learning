/*
Hollow Square
Print a square border with hollow inside.

📥 Input:
Enter size: 5

📤 Output:
* * * * *
*       *
*       *
*       *
* * * * *
 */
import java.util.Scanner;

public class HollowSquare
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Input size of the square
        System.out.print("Enter size: ");
        int size = scan.nextInt();

        // Loop for rows
        for (int i = 1; i <= size; i++)
        {

            // First Top <==> Bottom Last. fully filled with stars
            if (i == 1 || i == size) {
                // Print stars in entire row
                for (int j = 1; j <= size; j++)
                {
                    System.out.print("* ");
                }
            } else {
                // For middle rows, print star first and last position
                System.out.print("* ");
                for (int j = 2; j < size; j++)
                {
                    System.out.print("  "); // print space
                }
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scan.close();
    }
}
