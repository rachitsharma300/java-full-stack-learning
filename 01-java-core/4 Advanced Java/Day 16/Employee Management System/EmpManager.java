import java.util.*;
import java.util.stream.Collectors;

public class EmpManager implements EmpOperations
{
    private final List<Emp> employees;

    public EmpManager(List<Emp> employees)
    {
        this.employees = new ArrayList<>(employees);
    }

    public Map<String, List<Emp>> groupByDepartment()
    {
        return employees.stream()
                .collect(Collectors.groupingBy(Emp::department));
    }

    public List<Emp> getTop3HighestPaid()
    {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Emp::salary).reversed())
                .limit(3)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<Emp> getAllEmployees()
    {
        return Collections.unmodifiableList(employees);
    }

    public double calculteBonus(Emp emp)
    {
        return switch (emp.department())
        {
            case "IT" -> emp.salary() * 0.15;
            case "Finance" -> emp.salary() * 0.10;
            case "HR" -> emp.salary() * 0.05;
            default -> emp.salary() * 0.03;
        };
    }
}
