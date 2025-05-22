//Find maximum element in array

import java.util.Scanner;

public class MaximumElement
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ArrElement = new int[5];

        for (int i = 0; i<ArrElement.length; i++)
        {
            System.out.println("Enter Array of Elements at " + i + " Index");
            ArrElement[i] = scan.nextInt();
        }
        int max = ArrElement[0];

        for (int i = 0; i < ArrElement.length; i++) {
            if (ArrElement[i] > max) {
                max = ArrElement[i];
            }
        }
        System.out.println("Maximum Element is: " + max);
        scan.close();
    }
}