// Explain difference between Iterator and ListIterator with examples

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator
{
    public static void main(String[] args)
    {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Patna");

        // ----------- Using Iterator -----------
        System.out.println("Using Iterator (Forward Only):");
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // ----------- Using ListIterator -----------
        System.out.println("\nUsing ListIterator (Forward and Backward):");
        ListIterator<String> listItr = cities.listIterator();

        System.out.println("Forward direction:");
        while (listItr.hasNext())
        {
            System.out.println(listItr.next());
        }

        System.out.println("Backward direction:");
        while (listItr.hasPrevious())
        {
            System.out.println(listItr.previous());
        }
    }
}
