import java.util.ArrayList;
import java.util.List;

public class CollectionIntro
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Rachit");
        names.add("Parsuram");
        names.add("Rachit");  // allow duplicate

        System.out.println("Names List: " + names);
    }
}
