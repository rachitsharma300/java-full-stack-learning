package com.example.springTask.service;

import com.example.springTask.model.Employee;
import com.example.springTask.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer -> For Business Logic.
 * Controller handled request or response under logic service
 */
@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create new Employee
    public Employee create(Employee e) {
        return repository.save(e);
    }

    // Fetch all Employees
    public List<Employee> findAll() {
        return repository.findAll();
    }

    // Fetch Employee by ID
    public Employee findById(String employeeId) {
        return repository.findById(employeeId).orElse(null);
    }

    // Update Employee by ID
    public Employee update(String id, Employee newData) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(newData.getName());
                    existing.setEmail(newData.getEmail());
                    existing.setLocation(newData.getLocation());
                    return repository.save(existing);
                })
                .orElse(null);
    }

    // Delete Employee by ID
    public void delete(String id) {
        repository.deleteById(id);
    }
}
