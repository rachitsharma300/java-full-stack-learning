//Check if string is palindrome


import java.util.Scanner;

public class CheckPalindrome
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A String ");
        String inp = scan.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < inp.length() / 2; i++)
        {
            if (inp.charAt(i) != inp.charAt(inp.length() -1 -i))
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
        {
            System.out.println("This String is a Palindrome");
        }
        else
        {
            System.out.println("This String is not a Palindrome");
        }
        scan.close();
    }
}
