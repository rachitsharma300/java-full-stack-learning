import java.util.*;
public class SwapNo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swapping Numer is :---");
         
        System.out.println("Enter Your First Number");
        int a = scan.nextInt();

        System.out.println("Enter Your Second Number");
        int b = scan.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + " " + b);
    }  
}
