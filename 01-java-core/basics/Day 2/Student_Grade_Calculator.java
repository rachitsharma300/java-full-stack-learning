import java.util.*;
public class Student_Grade_Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks in 5 subjects < space separated >:");
        double[]marks = new double[5];

        for (int i=0; i < 5; i ++)
        {
            marks[i] = scan.nextDouble();
        }
        double total = 0;
        for (int i =0; i < 5; i ++)
        {
            total += marks[i];
        }
        double percentage = total / 5;
        if (percentage >= 90)
        {
            System.out.println("Grade: A");
        } else if (percentage >= 80)
        {
            System.out.println("Grade: B");
        } else if (percentage >= 70)
        {
            System.out.println("Grade: C");
        } else
        {
            System.out.println("Grade: Fail");
        }
        scan.close();
    }
}
