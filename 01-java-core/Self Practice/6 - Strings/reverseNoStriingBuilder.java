import java.util.Scanner;
public class reverseNoStriingBuilder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
    private static int reverseNumber(int number)
    {
  
        String numberStr = Integer.toString(number);
  
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();

        int reversedNumber = Integer.parseInt(reversedStr.toString());

        return reversedNumber;
    }
}
