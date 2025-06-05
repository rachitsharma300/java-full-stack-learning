import java.util.*;
public class ArrayQue 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your Array Size.");

        int size = sc.nextInt();
        int [] num = new int[size];

                System.out.println("Enter The Value In Array Index");

        for(int i=0; i<size; i++)
        {    num[i]=sc.nextInt();

        }
                System.out.println("Enter Your X No To Find In Array");
        int x = sc.nextInt();
        for(int i =0; i<num.length; i++)
        {
            if(num[i] == x)
            {
                System.out.println("X Found in Index No." + i);
            }
            else
            {
                System.out.println("X Not Found In Any Index No :( ");
            }
        }
    }

    
}
