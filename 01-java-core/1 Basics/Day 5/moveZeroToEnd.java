/*
Move All Zeros to End
Move all 0s in an array to the end while maintaining the order of non-zero elements.

Input:
int[] arr = {0, 1, 0, 3, 12};

// start=0, end= arr.length-1 arr[start]==0

Expected Output:
Output: [1, 3, 12, 0, 0]
 */
import java.util.Scanner;
public class moveZeroToEnd
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of an Array");
        int[] arr = new int[scan.nextInt()];

        for (int i= 0; i< arr.length; i++)
        {
            System.out.print("Array Elements " + (i +1) + ": ");
            arr[i] = scan.nextInt();
        }

        // Logic to move zero to End
        int index = 0;

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Step 2: Fill remaining positions with 0
        while (index < arr.length)
        {
            arr[index] = 0;
            index++;
        }
        // Print the updated array
        System.out.print("Output: [ ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        scan.close();
    }
}
