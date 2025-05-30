import java.util.*;

public class EmployeeDatabase
{
    private Map<Integer, Employee> employeeById = new HashMap<>();
    private Map<String, List<Employee>> employeesByName = new HashMap<>();

    public void addEmployee(Employee emp)
    {
        employeeById.put(emp.getId(), emp);

        employeesByName
                .computeIfAbsent(emp.getName().toLowerCase(), k -> new ArrayList<>())
                .add(emp);

        System.out.println("Employee added: " + emp);
    }

    public void updateEmployee(int id, Employee updatedEmp)
    {
        if (!employeeById.containsKey(id))
        {
            System.out.println("Employee not found with ID: " + id);
            return;
        }

        Employee oldEmp = employeeById.get(id);
        employeesByName.get(oldEmp.getName().toLowerCase()).remove(oldEmp);

        employeeById.put(id, updatedEmp);
        employeesByName
                .computeIfAbsent(updatedEmp.getName().toLowerCase(), k -> new ArrayList<>())
                .add(updatedEmp);

        System.out.println("Employee updated: " + updatedEmp);
    }

    public void deleteEmployee(int id)
    {
        Employee emp = employeeById.remove(id);
        if (emp != null)
        {
            employeesByName.get(emp.getName().toLowerCase()).remove(emp);
            System.out.println("Employee deleted: " + emp.getName());
        }
        else
        {
            System.out.println("Employee not found with ID: " + id);
        }
    }

    public void searchById(int id)
    {
        Employee emp = employeeById.get(id);
        if (emp != null)
        {
            System.out.println("Found: " + emp);
        }
        else
        {
            System.out.println("No employee found with ID: " + id);
        }
    }

    public void searchByName(String name)
    {
        List<Employee> results = employeesByName.get(name.toLowerCase());
        if (results != null && !results.isEmpty())
        {
            System.out.println("Search results:");
            for (Employee emp : results)
            {
                System.out.println(emp);
            }
        }
        else
        {
            System.out.println("No employee found with name: " + name);
        }
    }

    public void displayAllEmployees()
    {
        TreeSet<Employee> sorted = new TreeSet<>(employeeById.values());
        System.out.println("All Employees:");
        for (Employee emp : sorted)
        {
            System.out.println(emp);
        }
    }

    public void calculateAverageSalary(String department)
    {
        double total = 0;
        int count = 0;

        for (Employee emp : employeeById.values())
        {
            if (emp.getDepartment().equalsIgnoreCase(department))
            {
                total += emp.getSalary();
                count++;
            }
        }

        if (count > 0)
        {
            double average = total / count;
            System.out.printf("Average Salary in %s: %,.0f%n", department, average);
        }
        else
        {
            System.out.println("No employees found in department: " + department);
        }
    }
}
