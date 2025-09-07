package com.example.SpringWebMavenDemo.controller.employee;


import com.example.SpringWebMavenDemo.entity.employee.Employee;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentNotExistException;
import com.example.SpringWebMavenDemo.exceptions.employee.EmployeeNotExistException;
import com.example.SpringWebMavenDemo.service.employee.EmployeeService;
import com.example.SpringWebMavenDemo.util.Constants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping(Constants.EMPLOYEE_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee department, @PathVariable(Constants.ID) Long employeeId) {
        employeeService.checkIfEmployeeExists(employeeId);
        return ResponseEntity.ok(employeeService.updateEmployee(department, employeeId));
    }

    @DeleteMapping(Constants.EMPLOYEE_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable(Constants.ID) Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }


    @ExceptionHandler(EmployeeNotExistException.class)
    public ResponseEntity<String> handleNotFound(EmployeeNotExistException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Getting exception :"+ex.getMessage());
    }

}
