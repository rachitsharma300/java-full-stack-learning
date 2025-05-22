// Count even and odd numbers in array


import java.util.Scanner;

public class EvenOddArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Even = 0;
        int Odd = 0;

        int node [] = new int[5];

        for (int i =0 ; i < node.length; i++)
        {
            System.out.println("|-------------------------------------|");
            System.out.println("| Count even and odd numbers in array |");
            System.out.println("|-------------------------------------|");
            System.out.println("Enter " + i + " Node No " );
            node[i] = scan.nextInt();

            if (node[i] % 2 == 0 )
            {
                Even++;
            }
            else
            {
                Odd ++;
            }
        }
        System.out.println("Even Elements in Array is : " + Even);
        System.out.println("Odd Elements in Array is : " + Odd);
        scan.close();
    }
}
