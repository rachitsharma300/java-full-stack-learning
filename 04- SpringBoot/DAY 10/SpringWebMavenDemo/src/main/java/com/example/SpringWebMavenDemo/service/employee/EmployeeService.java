package com.example.SpringWebMavenDemo.service.employee;

import com.example.SpringWebMavenDemo.entity.employee.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee employee, long employeeId);

    void deleteEmployee(long employeeId);

    Employee checkIfEmployeeExists(Long employeeId);
}
