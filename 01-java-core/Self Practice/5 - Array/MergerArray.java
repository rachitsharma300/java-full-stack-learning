
// Merge two arrays

import java.util.Scanner;

public class MergerArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println("Enter Array 1 Elements at Index " + i);
            arr1[i] = scan.nextInt();
        }
        for (int j = 0; j < arr2.length; j++)
        {
            System.out.println("Enter Array 2 Elements at Index " + j);
            arr2[j] = scan.nextInt();
        }

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
        {
            merged[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++)
        {
            merged[arr1.length + j] = arr2[j];
        }

        System.out.println("Merged Array :");
        for (int i =0; i < merged.length; i++)
        {
            System.out.print(merged[i] + " ");
        }
        scan.close();
    }
}
