// Employee.java

public class Employee extends Person
{
    int employeeID;
    double salary;

    // Constructor using super to initialize Person attributes
    public Employee(String name, int age, int employeeID, double salary)
    {
        super(name, age); // Init parent class attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
