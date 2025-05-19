/*
Check if Array is Sorted in Ascending Order
Write a method that checks whether the array is sorted in ascending order.

Input:
int[] arr = {3, 5, 8, 9, 12};

Expected Output:
Is Sorted: true
 */
import java.util.Scanner;

public class arraySortedAsc
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter List Size:");
        int[] data = new int[scan.nextInt()];

        // Taking input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < data.length; i++)
        {
            data[i] = scan.nextInt();
        }

        // Check if array is sorted in ascending order
        boolean isSorted = true;  // Assume the array is sorted initially

        for (int i = 1; i < data.length; i++)
        {
            if (data[i] < data[i - 1])
            {
                isSorted = false;  // If any element is smaller than previous, it's not sorted
                break;  // Exit the loop as we already know it's not sorted
            }
        }

        System.out.println("Is Sorted: " + isSorted);
    }
}
