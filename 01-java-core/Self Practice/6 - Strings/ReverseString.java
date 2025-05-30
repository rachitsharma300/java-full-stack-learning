//Reverse a string

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String inp = scan.nextLine();

        String reversed = " ";

        for (int i = inp.length() -1; i >= 0; i--)
        {
            reversed += inp.charAt(i);
        }
        System.out.println("Reversed String" + reversed);

        scan.close();
    }
}
