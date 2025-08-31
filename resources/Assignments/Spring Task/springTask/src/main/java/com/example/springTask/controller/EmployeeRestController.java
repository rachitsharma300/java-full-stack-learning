package com.example.springTask.controller;

import com.example.springTask.model.Employee;
import com.example.springTask.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * REST API Controller for Employee CRUD operations.
 * These Endpoints Directly test on Postman or Swagger
 */
@Tag(name = "Employees", description = "Employee REST APIs")
@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeRestController {

    private final EmployeeService service;

    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @Operation(summary = "Create a new Employee")
    @PostMapping
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee) {
        Employee saved = service.create(employee);
        return ResponseEntity.created(URI.create("/employees/" + saved.getEmployeeId()))
                .body(saved);
    }

    @Operation(summary = "Get all Employees")
    @GetMapping
    public List<Employee> getAll() {
        return service.findAll();
    }

    @Operation(summary = "Get Employee by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") String id) {
        Employee employee = service.findById(id);
        return (employee == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(employee);
    }

    @Operation(summary = "Update Employee by ID")
    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable("id") String id,
                                           @Valid @RequestBody Employee employee) {
        Employee updated = service.update(id, employee);
        return (updated == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(updated);
    }

    @Operation(summary = "Delete Employee by ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
