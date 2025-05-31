// Find duplicate characters

import java.util.Scanner;

public class DuplicateCharacters
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String to check duplicate character");
        String inp = scan.nextLine();

        char[] chars = inp.toCharArray();
        boolean[] visited = new boolean[chars.length];

        System.out.println("Duplicate Character");

        for (int i = 0; i < chars.length; i++)
        {
            if (visited[i])
            {
                continue;
            }
            int count =1;
            for (int j = i + 1; j < chars.length; j++)
            {
                if (chars[i] == chars[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1 && chars[i] != ' ')
            {
                System.out.println(chars[i]);
            }
        }
        scan.close();
    }
}
