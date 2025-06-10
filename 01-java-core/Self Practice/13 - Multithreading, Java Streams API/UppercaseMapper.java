import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseMapper
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("parsu", "ram", "java", "stream");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect results into a list

        System.out.println("Uppercase Names:");
        upperCaseNames.forEach(System.out::println);
    }
}
