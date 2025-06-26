// Print sum of first N natural numbers


import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i; // sum += i;
        }
        System.out.println("Sum of first no " + num + " natural number is :" + sum );

        scan.close();
    }
}
