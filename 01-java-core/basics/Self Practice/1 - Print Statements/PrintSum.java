//3. Input two numbers and print their sum


import java.util.Scanner;

public class PrintSum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your First Number ");
        int num1 = scan.nextInt();
        System.out.println("Enter Your Second Number ");
        int num2 = scan.nextInt();

        int sum = num1 += num2;

        System.out.println("The sum of two is : " + sum);

        scan.close();
    }
}
