package com.example.SpringWebMavenDemo.service;


import java.util.List;
import java.util.Objects;

import com.example.SpringWebMavenDemo.entity.Department;
import com.example.SpringWebMavenDemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring service component.
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // Injects the DepartmentRepository dependency.

    @Override
    public Department saveDepartment(Department department) {
        // Saves and returns the department entity.
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        // Retrieves and returns a list of all department entities.
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        // Finds the existing department by ID.
        Department depDB = departmentRepository.findById(departmentId).get();
        
        // Updates fields if they are not null or empty.
        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        
        // Saves and returns the updated department entity.
        return departmentRepository.save(depDB);
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        // Deletes the department entity by its ID.
        departmentRepository.deleteById(departmentId);
    }
}