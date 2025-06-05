import java.util.*;
public class numberDigitInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Number");

        int num = scan.nextInt();
        int count =0;

        while (num>0) 
        {
            num = num/10;
            count++;
        }
        System.out.println("Number of Digit :--"+ count);
    }
}