//Find sum of array elements

import java.util.Scanner;

public class SumOfArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int[] arrElement = new int[5];

        for (int i = 0; i < arrElement.length; i++)
        {
            System.out.println("Enter Elements at " + i + " No index");
            arrElement[i] = scan.nextInt();
            sum += arrElement[i];
        }
        System.out.println(sum);
    }
}
