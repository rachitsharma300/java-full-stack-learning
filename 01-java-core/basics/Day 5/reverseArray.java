/*
Reverse an Array (Useful in UI/UX Scrolling)

Reverse the order of items in an array, such as reversing the order of images or recent activity logs.

Input:
int[] activityLog = {101, 102, 103, 104};

Expected Output:
Reversed Log: 104 103 102 101
 */
import java.util.Scanner;
public class reverseArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayLog = new int[4];
        System.out.println("Enter 4 Array Log :");
        for (int i = 0; i <4; i ++)
        {
            System.out.print("Log " + (i + 1) + ": " );
            arrayLog[i] = scan.nextInt();
        }
        System.out.print("\n Reversed Log ");
        for (int i = 3; i >= 0; i--)
        {
            System.out.print(arrayLog[i] + " ");
        }
        scan.close();
    }
}
