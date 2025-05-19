/*
Remove Duplicates from a Sorted Array

Remove duplicates from a sorted array. Return the new length and array (ignore extra space after).

Input:
int[] arr = {1, 1, 2, 2, 3, 4, 4};

Expected Output:
Unique Length: 4
Modified Array: [1, 2, 3, 4]
 */
import java.util.Scanner;

public class removeDuplicate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int[] arr = new int[scan.nextInt()];

        // Input elements
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Array Element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        // Logic to remove duplicates from sorted array
        if (arr.length == 0)
        {
            System.out.println("Unique Length: 0");
            System.out.println("Modified Array: []");
            return;
        }

        int j = 0; // last index of unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; // shift unique element forward
            }
        }

        // Print result
        System.out.println("Unique Length: " + (j + 1));
        System.out.print("Modified Array: [ ");
        for (int i = 0; i <= j; i++)
        {
            System.out.print(arr[i]);
            if (i != j)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
