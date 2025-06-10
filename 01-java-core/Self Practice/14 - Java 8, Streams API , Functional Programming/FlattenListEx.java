//  Write a Stream to flatten a list of lists using flatMap()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListEx
{
    public static void main(String[] args)
    {
        List<List<String>> nestedLisst = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("D", "E")
        );

        List<String> flatList = nestedLisst.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());

        System.out.println("Flattened List: " + flatList);
    }
}
