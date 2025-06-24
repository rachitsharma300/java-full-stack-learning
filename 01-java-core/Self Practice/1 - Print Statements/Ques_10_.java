// Input a sentence and count how many words it has.

import java.util.Scanner;

public class Ques_10_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Total num of words: " + words.length);

        scan.close();
    }
}
