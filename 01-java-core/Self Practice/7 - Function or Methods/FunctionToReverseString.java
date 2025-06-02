// Function to reverse a string


import java.util.Scanner;

public class FunctionToReverseString
{
    public static String reverse(String str)
    {
        String reversed = "";
        for (int i = str.length() -1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name");
        String input = scan.nextLine();
        System.out.println("Reversed String : " + reverse(input));

        scan.close();
    }
}
