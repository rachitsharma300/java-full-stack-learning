// Explain Comparable and Comparator interfaces with example to sort objects by age.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Human implements Comparable<Human>
{
    String name;
    int age;

    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // natural ordering : By age
    @Override
    public int compareTo(Human other)
    {
        return this.age - other.age;
    }

    @Override
    public String toString()
    {
        return name + " (" + age + ")";
    }
}
// Comparator to sort by name
class NameComparator implements Comparator<Human>
{
    public int compare(Human h1, Human h2)
    {
        return h1.name.compareTo(h2.name);
    }
}
public class ComparableVsComparator
{
    public static void main(String[] args)
    {
        List<Human> Person = new ArrayList<>();
        Person.add(new Human("Rachit", 24));
        Person.add(new Human("Anjali", 22));
        Person.add(new Human("Bhavesh", 25));

        // Sort using Comparable (By age)
        Collections.sort(Person);
        System.out.println("Sorted by age (Comparable)");
        for (Human h : Person)
        {
            System.out.println(h);
        }

        //Sort using Comparator (By name)
        Collections.sort(Person, new NameComparator());
        System.out.println("\nSorted by name (Comparator):");
        for (Human h : Person)
        {
            System.out.println(h);
        }
    }
}
