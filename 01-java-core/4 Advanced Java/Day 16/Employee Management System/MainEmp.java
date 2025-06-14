import java.time.LocalDate;
import java.util.List;

public class MainEmp
{
    public static void main(String[] args)
    {
        var employees = List.of(
                new Emp("E101", "Alice", "HR", 65000, LocalDate.of(2020, 5, 15)),
                new Emp("E102", "Bob", "IT", 85000, LocalDate.of(2019, 8, 20)),
                new Emp("E103", "Charlie", "Finance", 75000, LocalDate.of(2021, 3, 10)),
                new Emp("E104", "Diana", "IT", 90000, LocalDate.of(2018, 11, 5))
        );

        var manager = new EmpManager(employees);
        var topEmployees = manager.getTop3HighestPaid();
        var hrEmployees = manager.groupByDepartment().get("HR");
        var sampleEmp = employees.get(1);

        System.out.println("Top 3 Employees:\n");
        topEmployees.forEach(emp -> System.out.println(manager.getFormattedEmpInfo(emp)));

        System.out.println("\nBonus for " + sampleEmp.name() + ": $" + manager.calculteBonus(sampleEmp));

        if (hrEmployees != null)
        {
            System.out.println("\nHR Department Employees: ");
            hrEmployees.forEach(emp -> System.out.println(emp.name()));
        }
    }
}
