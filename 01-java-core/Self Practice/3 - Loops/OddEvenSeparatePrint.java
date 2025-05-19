/*
 Write a code get an integer number as input and print the odd and even digits of the number separately.

     Input Description:
     A single line containing an integer.

     Output Description:
     Print the even and odd integers of the integer in a separate line.

     Sample Input:
     1234
     Sample Output:
     2 4
     1 3
 */


import java.util.Scanner;

public class OddEvenSeparatePrint
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String numStr = scan.nextLine();

        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++)
        {
            char ch = numStr.charAt(i);
            int digit = ch - '0'; // Convert character to int

            if (digit % 2 == 0)
            {
                evenDigits.append(digit).append(" ");
            }
            else
            {
                oddDigits.append(digit).append(" ");
            }
        }
        System.out.println(evenDigits.toString().trim());
        System.out.println(oddDigits.toString().trim());

        scan.close();
    }
}
