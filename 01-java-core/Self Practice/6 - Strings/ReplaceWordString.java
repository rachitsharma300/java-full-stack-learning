// Replace a word in a string

import java.util.Scanner;

public class ReplaceWordString
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

        System.out.println("Enter a character to replace with String :");
        char target = scan.next().charAt(0);

        System.out.println("Enter the replacement String:");
        String replacement = scan.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0;i <str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == target)
            {
                result.append(replacement);
            }
            else
            {
                result.append(ch);
            }
        }
        System.out.println("Modified String " + result.toString());
    }
}
