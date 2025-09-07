package com.example.SpringWebMavenDemo.service.department;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.example.SpringWebMavenDemo.entity.department.Department;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentAlreadyExistException;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentNotExistException;
import com.example.SpringWebMavenDemo.repository.department.DepartmentRepository;
import com.example.SpringWebMavenDemo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring service component.
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // Injects the DepartmentRepository dependency.

    @Override
    public Department saveDepartment(Department department) {

        if (departmentRepository.findByDepartmentName(department.getDepartmentName()).isPresent()) {
            throw new DepartmentAlreadyExistException("Department " + department.getDepartmentName() + " already exists. So cannot be created");
        }

        // Saves and returns the department entity.
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        // Retrieves and returns a list of all department entities.
        return (List<Department>) departmentRepository
                .findAll(Sort.by(
                        Sort.Order.desc("departmentId")
                        )
                );
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        Optional<Department> currentDepartment = departmentRepository.findById(departmentId);
        if(!currentDepartment.isPresent()){
            throw new DepartmentNotExistException("Department with id "+departmentId+" does not exist in system");
        }
        return currentDepartment.get();
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        // Finds the existing department by ID.
        Optional<Department> optionalDepartment = departmentRepository.findById(departmentId);

        if (!optionalDepartment.isPresent()) {
            return null;
        }
        Department depDB = optionalDepartment.get();
        // Updates fields if they are not null or empty.
        if (Objects.nonNull(department.getDepartmentName()) && !Constants.BLANK_STRING.equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) && !Constants.BLANK_STRING.equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode()) && !Constants.BLANK_STRING.equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        // Saves and returns the updated department entity.
        return departmentRepository.save(depDB);
    }

    @Override
    public void checkIfDepartmentExists(Long departmentId) {
        departmentRepository.findById(departmentId).orElseThrow(() -> new DepartmentNotExistException("Department " + departmentId + " does not exists"));
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        // Deletes the department entity by its ID.
        departmentRepository.deleteById(departmentId);
    }
}