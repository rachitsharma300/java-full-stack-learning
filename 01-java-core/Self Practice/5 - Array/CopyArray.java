// Copy one array to another

import java.util.Scanner;

public class CopyArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] Originalary = new int[5];

        for (int i = 0; i < Originalary.length; i++)
        {
            System.out.println("Enter Elements at Index " + i);
            Originalary[i] = scan.nextInt();
        }

        int[] copy = new int[Originalary.length];

        for (int i = 0; i < Originalary.length; i++)
        {
            copy[i] = Originalary[i];
        }
        System.out.println("Copy Array");
        for (int i = 0; i < Originalary.length; i++)
        {
            System.out.print(copy[i] + " ");
        }
        scan.close();
    }
}
