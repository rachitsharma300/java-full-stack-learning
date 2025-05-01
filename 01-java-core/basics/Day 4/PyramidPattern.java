
/*
Pyramid Pattern
Print a symmetrical pyramid of stars.

Input:
Enter number of rows: 5
Output:
        *
      ***
    *****
  *******
*********
 */
import java.util.Scanner;
public class PyramidPattern
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
