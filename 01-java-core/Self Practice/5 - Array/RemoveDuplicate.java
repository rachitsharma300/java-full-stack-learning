// Remove duplicate elements

import java.util.Scanner;

public class RemoveDuplicate
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ary = new int[6];
        System.out.println("Enter 6 Elements including duplicate");

        for (int i =0; i < ary.length; i++)
        {
            ary[i] = scan.nextInt();
        }
        int[] temp = new int[ary.length];
        int uniqueCount = 0;

        //Logic rev duplicate
        for (int i =0; i <ary.length; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++)
            {
                if (ary[i] == temp[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
            {
                temp[uniqueCount] = ary[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing Duplicates Elements :");
        for (int i =0; i < uniqueCount; i++)
        {
            System.out.print(temp[i] + " ");
        }
        scan.close();
    }
}
