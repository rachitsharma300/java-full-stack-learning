import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface EmpOperations
{
    default String getFormattedEmpInfo(Emp employee)
    {
        return """
                Employee ID: %s
                Name: %s
                Department: %s
                Salary: %s
                Joined On: %s
                """.formatted(
            employee.id(),
            employee.name(),
            employee.department(),
            employee.salary(),
            formatDate(employee.joiningDate())
    );
    }

    private String formatDate(LocalDate date)
    {
        return date.format(DateTimeFormatter.ofPattern("MM dd, yyyy"));
    }
}
