// Check if two strings are anagrams

import java.util.Arrays;

public class AnagramCheck
{
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Convert both to lowercase (optional if case-insensitive)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 2: Check lengths
        if (str1.length() != str2.length())
        {
            System.out.println("Not Anagrams");
        }
        else
        {
            // Step 3: Convert to char arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Step 4: Compare sorted arrays
            if (Arrays.equals(arr1, arr2))
            {
                System.out.println("Strings are Anagrams");
            }
            else
            {
                System.out.println("Strings are NOT Anagrams");
            }
        }
    }
}
