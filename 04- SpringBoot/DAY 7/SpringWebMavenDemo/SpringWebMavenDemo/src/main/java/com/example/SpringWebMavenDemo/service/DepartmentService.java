package com.example.SpringWebMavenDemo.service;


import com.example.SpringWebMavenDemo.entity.Department;

import java.util.List;
public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department updateDepartment(Department department, Long departmentId);
    void deleteDepartmentById(Long departmentId);
}