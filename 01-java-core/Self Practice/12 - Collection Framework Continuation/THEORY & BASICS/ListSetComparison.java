import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetComparison
{
    public static void main(String[] args)
    {
        List<String > listexamples = new ArrayList<>();

        listexamples.add("Rachit");
        listexamples.add("Rohit");
        listexamples.add("Rachit"); // duplicate allow

        for (String list : listexamples)
        {
            System.out.println("List Elements (with Duplicates) " + list);
        }

        Set<String > setexamples = new HashSet<>();

        setexamples.add("Rachit");
        setexamples.add("Rohit");
        setexamples.add("Rachit"); // duplicate ignored

        for (String set : setexamples)
        {
            System.out.println("List Elements (No Duplicates) " + set);
        }
    }
}
