// Reverse a number using loop

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int reverse = 0;

        while (num != 0){
         int digit = num % 10;
         reverse = reverse * 10 + digit;
         num = num / 10;
        }
        System.out.println("Reverse number" + reverse);
    }
}
