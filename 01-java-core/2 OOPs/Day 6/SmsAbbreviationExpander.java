/*
SMS Abbreviation Expander (String)
Objective: Replace short forms with full words using replace().
Problem: Create a dictionary of common SMS abbreviations:
•	u → you
•	r → are
•	idk → I don't know
•	btw → by the way
Take a message and replace all abbreviations with full words.

Example Input:
idk what u r doing btw

Example Output:
I don't know what you are doing by the way

 */
    import java.util.Scanner;

    public class SmsAbbreviationExpander {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //Input the SMS text
            System.out.print("Enter your message: ");
            String message = scan.nextLine();

            //Replace abbreviations using replace()
            message = message.replace("idk", "I don't know");
            message = message.replace("u", "you");
            message = message.replace("r", "are");
            message = message.replace("btw", "by the way");

            // Output expanded message
            System.out.println("Expanded Message: " + message);

            scan.close();
        }
    }