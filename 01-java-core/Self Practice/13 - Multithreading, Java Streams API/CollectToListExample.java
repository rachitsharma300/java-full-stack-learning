import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Java", "Stream", "Api");

        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());  // Collect elements to List

        System.out.println("Filtered names: " + result);
    }
}
