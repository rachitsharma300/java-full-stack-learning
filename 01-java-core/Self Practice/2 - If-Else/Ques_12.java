//Check if a number is a multiple of 3 or 7.
//Input: A number
//Output: "Multiple of 3", "Multiple of 7", "Multiple of both", or "Not a multiple"


import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("Multiple of both");
        } else if (num % 3 == 0) {
            System.out.println("Multiple of 3");
        } else if (num % 7 == 0) {
            System.out.println("Multiple of 7");
        } else {
            System.out.println("Not a multiple");
        }
        scan.close();
    }
}
