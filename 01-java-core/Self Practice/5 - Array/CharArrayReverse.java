/*
Write a program in Java that takes a size n from the user,
    then takes n characters as input to form a character array.
    Reverse the character array and print the reversed result
    as a string.

---Expected Output---
Enter size of character array: 5
Enter 5 characters:
char[0]: e
char[1]: l
char[2]: p
char[3]: p
char[4]: a
Reversed: apple
 */

import java.util.Scanner;

public class CharArrayReverse
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array :");
        int size = scan.nextInt();

        char[] charArray = new char[size];

        System.out.println("Enter " + size + " Characters :");
        for (int i =0; i < size; i++)
        {
            System.out.print("char[" + i + "]: ");
            charArray[i] = scan.next().charAt(0);
        }

        for (int i =0; i < size / 2; i++)
        {
            char temp = charArray[i];
            charArray[i] = charArray[size -1 -i];
            charArray[size -1 -i] = temp;
        }
        System.out.print("Reversed: ");
        for (char c : charArray)
        {
            System.out.print(c);
        }
        scan.close();
    }
}
