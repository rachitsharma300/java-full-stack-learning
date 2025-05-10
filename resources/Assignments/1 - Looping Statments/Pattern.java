/*
Write a java program to print below pattern -> i and k => 5
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2
5 4 3 2 1
*/
public class Pattern
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 5; j >= 1; j--)
            {
                if (j > i)
                {
                    System.out.print(i + " ");
                } else
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
