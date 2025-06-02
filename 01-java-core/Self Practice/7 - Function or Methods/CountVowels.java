// Function with string parameter (count vowels)

public class CountVowels
{
    public static int countVowels(String str)
    {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String input = "Hello Rachit";
        int vowels = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + vowels);
    }
}
