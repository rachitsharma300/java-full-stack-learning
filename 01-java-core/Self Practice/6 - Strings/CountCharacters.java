//Count characters in a string

import java.util.Scanner;

public class CountCharacters
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scan.nextLine();

        int count =0;
        for (int i = 0; i < input.length(); i++)
        {
            count++;
        }
        System.out.print("Total Number of Character:  " + count);

        scan.close();
    }
}
