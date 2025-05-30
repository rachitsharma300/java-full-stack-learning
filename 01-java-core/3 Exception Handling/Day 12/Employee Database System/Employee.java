import java.util.Objects;

public class Employee implements Comparable<Employee>
{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId()
    { return id; }
    public String getName()
    { return name; }
    public String getDepartment()
    { return department; }
    public double getSalary()
    { return salary; }

    // Setters
    public void setName(String name)
    { this.name = name; }
    public void setDepartment(String department)
    { this.department = department; }
    public void setSalary(double salary)
    { this.salary = salary; }

    @Override
    public int compareTo(Employee other)
    {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString()
    {
        return name + ", " + department + ", " + String.format("%,.0f", salary);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
