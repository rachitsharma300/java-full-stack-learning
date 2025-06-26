// Print multiplication table of any number

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
        scan.close();
    }
}
