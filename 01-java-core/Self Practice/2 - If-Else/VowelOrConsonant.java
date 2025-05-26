import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Enter a single alphabet character: ");
        char ch = scan.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if it is a letter
        if (!Character.isLetter(ch))
        {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
        else
        {
            // Vowel or Consonant check
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(ch + " is a Vowel.");
            }
            else
            {
                System.out.println(ch + " is a Consonant.");
            }
        }

        scan.close();
    }
}
