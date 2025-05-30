// Count vowels and consonants

import java.util.Scanner;

public class CountVowelConsonants
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scan.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            if (Character.isLetter(ch))
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels ++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        scan.close();
    }
}
