public class RunEmployee {
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();

        db.addEmployee(new Employee(101, "John", "HR", 50000));
        db.addEmployee(new Employee(102, "Alice", "Finance", 60000));

        db.updateEmployee(102, new Employee(102, "Alice", "Finance", 65000));

        db.deleteEmployee(101);

        db.displayAllEmployees();

        db.calculateAverageSalary("Finance");
    }
}
