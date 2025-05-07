/*
Write a code to get 2 integers as input and add the integers without any carry.

Input Description:
A single line containing 2 integers.

Output Description:
Print Sum of the 2 integers without carry

Sample Input:
44 66
Sample Output:
0
 */


import java.util.Scanner;

public class AddWithoutCarry
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = 0;  // store the result
        int placeValue = 1;  // Place value tracker

        // Loop until both numbers become 0
        while (num1 > 0 || num2 > 0)
        {
            // Extracting the last digits of both numbers
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            // Add digits and ignore the carry value
            int sum = (digit1 + digit2) % 10;

            // Update the result with the new sum
            result = result + (sum * placeValue);

            // Move to the next place value
            placeValue *= 10;

            // Remove the last digit from both numbers
            num1 /= 10;
            num2 /= 10;
        }
        // Print the final result
        System.out.println(result);
        scan.close();
    }
}
