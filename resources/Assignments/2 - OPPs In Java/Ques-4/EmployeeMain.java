/*
Define a base class Person with attributres name and age.
Create a sbclass Employee that inherits from Person and adds attributes like employeeID
and Salary.
Use the super keyword to initialze the Person attributes in the Employess constructors.
 */
public class EmployeeMain {
    public static void main(String[] args) {
        // Creating an object of Employee and passing values
        Employee emp = new Employee("Rachit", 26, 1001, 75000.50);

        // Display employee details
        emp.displayDetails();
    }
}
/*
Expected Output:
Name: Rachit
Age: 26
Employee ID: 1001
Salary: 75000.5
*/