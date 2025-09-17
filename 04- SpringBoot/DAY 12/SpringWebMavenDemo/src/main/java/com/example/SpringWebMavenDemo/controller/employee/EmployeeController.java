package com.example.SpringWebMavenDemo.controller.employee;


import com.example.SpringWebMavenDemo.entity.employee.Employee;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentNotExistException;
import com.example.SpringWebMavenDemo.exceptions.employee.EmployeeAlreadyExistException;
import com.example.SpringWebMavenDemo.exceptions.employee.EmployeeNotExistException;
import com.example.SpringWebMavenDemo.service.employee.EmployeeService;
import com.example.SpringWebMavenDemo.util.Constants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping(Constants.EMPLOYEE_URL_PATH)
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {

        Employee savedEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity
                .created(URI.create(Constants.DEPARTMENTS_URL_PATH+"/"+savedEmployee.getEmployeeId()))
                .body(savedEmployee);
    }

    @GetMapping(Constants.EMPLOYEE_URL_PATH)
    public List<Employee> fetchDepartmentList() {

        return employeeService.getAllEmployees();
    }

    @GetMapping(Constants.EMPLOYEE_URL_PATH+"/highestSalaryEmployee")
    public List<Employee> fetchEmployeeWithHighestSalary(@RequestParam("deptName") String departmentName) {
        return employeeService.getEmployeeByHighestSalary(departmentName);
    }


    @PutMapping(Constants.EMPLOYEE_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee department, @PathVariable(Constants.ID) Long employeeId) {
        employeeService.checkIfEmployeeExists(employeeId);
        return ResponseEntity.ok(employeeService.updateEmployee(department, employeeId));
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(Constants.EMPLOYEE_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable(Constants.ID) Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }


    @ExceptionHandler(EmployeeNotExistException.class)
    public ResponseEntity<String> handleNotFound(EmployeeNotExistException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Getting exception :"+ex.getMessage());
    }

    @ExceptionHandler(EmployeeAlreadyExistException.class)
    public ResponseEntity<String> handleExistingEmployee(EmployeeAlreadyExistException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());

    }
}
