package com.example.SpringWebMavenDemo.controller.department;


import java.net.URI;
import java.util.List;

import com.example.SpringWebMavenDemo.entity.department.Department;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentNotExistException;
import com.example.SpringWebMavenDemo.service.department.DepartmentService;
import com.example.SpringWebMavenDemo.util.Constants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a RESTful controller.
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService; // Injects the DepartmentService dependency.
    @PostMapping(Constants.DEPARTMENTS_URL_PATH)
    public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department) {

        Department savedDepartment = departmentService.saveDepartment(department);
        return ResponseEntity
                .created(URI.create(Constants.DEPARTMENTS_URL_PATH+"/"+savedDepartment.getDepartmentId()))
                .body(savedDepartment);
    }
    @GetMapping(Constants.DEPARTMENTS_URL_PATH)
    public List<Department> fetchDepartmentList() {

        return departmentService.fetchDepartmentList();
    }

    @GetMapping(Constants.DEPARTMENTS_URL_PATH+"/{"+Constants.ID+"}")
    public Department fetchDepartmentById(@PathVariable(Constants.ID) Long departmentId) {

        return departmentService.fetchDepartmentById(departmentId);
    }
 
    @PutMapping(Constants.DEPARTMENTS_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> updateDepartment(@RequestBody Department department, @PathVariable(Constants.ID) Long departmentId) {
        departmentService.checkIfDepartmentExists(departmentId);
        return ResponseEntity.ok(departmentService.updateDepartment(department, departmentId));
    }

    @DeleteMapping(Constants.DEPARTMENTS_URL_PATH+"/{"+Constants.ID+"}")
    public ResponseEntity<Object> deleteDepartmentById(@PathVariable(Constants.ID) Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(DepartmentNotExistException.class)
    public ResponseEntity<String> handleNotFound(DepartmentNotExistException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Getting exception :"+ex.getMessage());
    }

}