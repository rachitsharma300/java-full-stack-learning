//Reverse the array


import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrElement = new int[5];

        for (int i = 0; i < arrElement.length; i++)
        {
            System.out.println("Enter Elements Array at " + i + " No Index");
            arrElement[i] = scan.nextInt();
        }

        for (int i = 0; i < arrElement.length / 2; i++)
        {
            int temp = arrElement[i];
            arrElement[i] = arrElement[arrElement.length -1 -i];
            arrElement[arrElement.length -1 -i] = temp;
        }
        System.out.println("Reverse Array");
        for (int i =0; i < arrElement.length; i++)
        {
            System.out.print(arrElement[i] + " ");
        }
        scan.close();
    }
}
