//  Write a lambda expression for Comparator to sort objects by multiple fields

import java.util.Arrays;
import java.util.List;

class OrbitingSatellite
{
    String identifier;
    int orbitHeightKm;

    OrbitingSatellite(String identifier, int orbitHeightKm)
    {
        this.identifier = identifier;
        this.orbitHeightKm = orbitHeightKm;
    }

    @Override
    public String toString()
    {
        return identifier + " @ " + orbitHeightKm + " Km";
    }
}

public class SatelliteSorter
{
    public static void main(String[] args)
    {
        List<OrbitingSatellite> satellites = Arrays.asList(
                new OrbitingSatellite("Sat-Alpha", 500),
                new OrbitingSatellite("Sat-Beta",800),
                new OrbitingSatellite("Sat-Alpha", 300),
                new OrbitingSatellite("Sat-Gamma", 800)
        );

        // Sort by identifier alphabetically, then by orbit height ascending
        satellites.sort((s1, s2) -> {
            int nameCompare = s1.identifier.compareTo(s2.identifier);
            return (nameCompare !=0) ? nameCompare : Integer.compare(s1.orbitHeightKm, s2.orbitHeightKm);
        });

        // Print sorted List
        satellites.forEach(System.out::println);
    }
}
