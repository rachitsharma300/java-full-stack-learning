public class Employee
{
    private int id;
    private String name;
    private String department;
    private double salary;
    private String location;
    private int age;

    public Employee(int id, String name, String department, double salary, String location, int age)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.location = location;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getLocation()
    {
        return location;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return id + ", " + name + ", " + department + ", " + salary + ", " + location + ", " + age;
    }
}
