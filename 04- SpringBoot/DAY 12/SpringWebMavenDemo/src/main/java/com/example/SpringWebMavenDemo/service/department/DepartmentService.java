package com.example.SpringWebMavenDemo.service.department;


import com.example.SpringWebMavenDemo.entity.department.Department;

import java.util.List;
public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);
    Department updateDepartment(Department department, Long departmentId);

    void checkIfDepartmentExists(Long departmentId);
    void deleteDepartmentById(Long departmentId);
}