//Print even numbers from 1 to 50

import java.util.Scanner;

public class EvenNo1To50
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[scan.nextInt()];

     /*   for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
      */
        for (int i = 0; i<num.length; i ++)
        {
            num[i] = scan.nextInt();
            if (num[i] % 2 == 0 )
            {
                System.out.print(num[i]);
            }
        }
        scan.close();
    }
}
