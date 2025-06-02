import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAnalytics {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = loadEmployees("C:\\Users\\MAUSAM\\Desktop\\java-full-stack-learning\\01-java-core\\4 Advanced Java\\Day 14\\Employee Analytics Using Java Streams\\employees.csv");

        // Average Salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
        System.out.println("Average Salary :" + averageSalary);

        // Employees in Engg sorted by salary Dec..
        System.out.println("\nEngineering Employees (High to low Salary):");
        employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("Engineering"))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);

        // Group By location and count
        System.out.println("\nEmployees per Location:");
        Map<String, Long> locationCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getLocation, Collectors.counting()));
        locationCount.forEach((loc, count) -> System.out.println(loc + ": " + count));


        //Highest Paid Emp
        employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(e -> System.out.println("\nHighest Paid Employee: " + e));

        // Average age per Department
        System.out.println("\nAverage Age per Department:");
        Map<String, Double> avgAgeDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getAge)));
        avgAgeDept.forEach((dept, avgAge) -> System.out.println(dept + ": " + avgAge));


        // Partition by age
        System.out.println("\nPartitioned by Age < 30 and >= 30:");
        Map<Boolean, List<Employee>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() < 30));
        System.out.println("Younger than 30:");
        partitioned.get(true).forEach(System.out::println);
        System.out.println("30 or older:");
        partitioned.get(false).forEach(System.out::println);

        // Departments with employees earning > 100000
        System.out.println("\nDepartments with Employees earning > 100000:");
        employees.stream()
                .filter(e -> e.getSalary() > 100000)
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        // Department -> List of Names (sorted)
        System.out.println("\nDepartment -> Sorted List of Employee Names:");
        Map<String, List<String>> deptToNames = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.collectingAndThen(Collectors.toList(), list -> {
                                    list.sort(String::compareTo);
                                    return list;
                                }))));
        deptToNames.forEach((dept, names) -> System.out.println(dept + ": " + names));
    }

    // Load CSV and return List<Employee>

    private static List<Employee> loadEmployees(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .skip(1) // skip Header
                .map(line -> {
                    String[] parts = line.split(",");
                    return new Employee(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            parts[2].trim(),
                            Double.parseDouble(parts[3].trim()),
                            parts[4].trim(),
                            Integer.parseInt(parts[5].trim())
                    );
                })
                .collect(Collectors.toList());
    }

}

