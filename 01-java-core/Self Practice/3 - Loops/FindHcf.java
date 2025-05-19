/*
Write a code to get 2 integers as input and find the HCF of the 2 integer without using recursion or Euclidean algorithm.

Input Description:
A single line containing 2 integers separated by space.

Output Description:
Print the HCF of the integers.

Sample Input:
2 3
Sample Output:
1
*/

import java.util.Scanner;

public class FindHcf
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // Determine the smaller of the two numbers
        int min = (num1 < num2) ? num1 : num2;
        int hcf = 1;  // Initialize HCF as 1

        // Iterate from 1 to the smaller of the two numbers
        for (int i = 1; i <= min; i++) {
            // If both numbers are divisible by 'i', it's a common divisor
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;  // Update HCF
            }
        }
        System.out.println(hcf);
        scan.close();
    }
}