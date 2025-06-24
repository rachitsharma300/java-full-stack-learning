/*
11. Input a character and print its ASCII value.
(Example: Input: A → Output: 65)
*/


import java.util.Scanner;

public class PrintASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a input");
        char ch = scan.next().charAt(0);

        // Logic
        int ascii = (int) ch;

        System.out.println("ASCII value of " + ch + "is :" + ascii);

        scan.close();
    }
}
