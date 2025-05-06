//10. Take a sentence input and print each word on a new line


import java.util.Scanner;

public class BreakLinePrint
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a Sentence :");
        String sentence = scan.nextLine();


//  1 Approach
//        String[] words = sentence.split(" ");
//
//        for (String word : words)
//        {
//            System.out.println(word);
//        }

//  2. Approach
        String word = "";
        for (int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);

            if (ch != ' ')
            {
                word += ch;
            } else {
                System.out.println(word);
                word = "";
            }
        }
        System.out.println(word); // last word

        scan.close();
    }
}
