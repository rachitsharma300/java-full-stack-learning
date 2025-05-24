// Sort array in ascending order

import java.util.Scanner;

public class SortArrayAsc
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ary = new int[5];
        for (int i= 0; i < ary.length; i++)
        {
            System.out.println("Enter Elements at Index " + i);
            ary[i] = scan.nextInt();
        }

        for (int i = 0; i < ary.length -1; i++ ) // Bubble sort
        {
            for (int j = 0; j < ary.length -1 -i; j++)
            {
                if (ary[j] > ary[j + 1])
                {
                    int temp = ary[j];  // swap
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in AES Order :");
        for (int i =0; i < ary.length; i++)
        {
            System.out.print(ary[i] + " ");
        }
        scan.close();
    }
}
