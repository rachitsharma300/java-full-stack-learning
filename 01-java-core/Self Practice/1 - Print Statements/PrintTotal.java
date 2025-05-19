//Take input of marks in 5 subjects and print total


import java.util.Scanner;

public class PrintTotal
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[5];

        int totalSum = 0;

        for (int i = 0; i <5; i ++)
        {
            System.out.println("Enter Subject Marks " + (i+1)  + " : ");
            num[i] = scan.nextInt();
            totalSum += num[i];
        }
        System.out.println("Total Marks of 5 Subject : " + totalSum);

        scan.close();
    }
}
