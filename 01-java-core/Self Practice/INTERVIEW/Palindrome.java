import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0, j = s.length() - 1;
        boolean isPalin = true;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalin = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalin ? "yes" : "no");
    }
}
