// Create a LinkedList of Strings and add 3 names. Iterate and print.

import java.util.LinkedList;

public class LinkedListEx
{
    public static void main(String[] args)
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Rachit");
        names.add("Rahul");
        names.add("Rachit");

        for (String name : names)
        {
            System.out.println("Names: " + name);
        }
    }
}
