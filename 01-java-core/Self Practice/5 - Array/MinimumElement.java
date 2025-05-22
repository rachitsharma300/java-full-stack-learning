//Find minimum element in array


import java.util.Scanner;

public class MinimumElement
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[]arrElement = new int[5];

        for (int i = 0; i < arrElement.length; i++)
        {
            System.out.println("Enter Elements at " + i + " Index");
            arrElement[i] = scan.nextInt();
        }
            int min = arrElement[0];

        for (int i = 1; i < arrElement.length; i++)
        {
            if (arrElement[i] < min){
                min = arrElement[i];
            }
        }
        System.out.println("Minimum Elements is " + min);
        scan.close();
    }
}
