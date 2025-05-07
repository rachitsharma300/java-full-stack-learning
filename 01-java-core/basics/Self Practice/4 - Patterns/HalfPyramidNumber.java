/*
Generate a half-pyramid pattern using numbers.

   Input Description:
   Given an integer R indicates numbers of rows.

   Where 1<=R<=100.

   Output Description:
   Print the half-pyramid pattern based on the given integer R.

   Sample Input:
   5
   Sample Output:
   1
   12
   123
   1234
   12345
 */


import java.util.Scanner;

public class HalfPyramidNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        for (int i = 1; i <= size; i ++)
        {
            for (int j = 1; j <= i; j ++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        scan.close();
    }
}
