// Count digits in a number

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num =  num /10;
                count++;
            }
            System.out.println("Count Number is: " + count);
        }
    }
}
