// Class to represent an Employee and calculate income tax
class Employee implements Taxable
{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary)
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementation of calcTax for yearly salary
    public void calcTax()
    {
        double yearlySalary = salary * 12;
        double tax = yearlySalary * incomeTax;
        System.out.println("\n Income Tax for " + name + " (Yearly Salary ₹" + yearlySalary + "): ₹" + String.format("%.2f", tax));
    }
}
