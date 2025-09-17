package com.example.SpringWebMavenDemo.service.employee;

import com.example.SpringWebMavenDemo.entity.employee.Employee;
import com.example.SpringWebMavenDemo.exceptions.employee.EmployeeAlreadyExistException;
import com.example.SpringWebMavenDemo.exceptions.employee.EmployeeNotExistException;
import com.example.SpringWebMavenDemo.repository.employee.EmployeeRepository;
import com.example.SpringWebMavenDemo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {

        if(employee.getEmail()!=null && !Constants.BLANK_STRING.equalsIgnoreCase(employee.getEmployeeName())) {
            Employee dbEmployee = employeeRepository.findEmployeeByEmail(employee.getEmail());
            if(dbEmployee!=null) {
                throw new EmployeeAlreadyExistException(" Employee with email "+ employee.getEmail() +" already exists so cannot be created. Use different email for adding the employee");
            }
        }

        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeByHighestSalary(String departmentName) {
        return employeeRepository
                .findTop2EmployeesWithHighestSalary(departmentName);
    }

    @Override
    public Employee updateEmployee(Employee employee, long employeeId) {
        Optional<Employee> existingEmployee = employeeRepository.findById(employeeId);

        if(!existingEmployee.isPresent()) return null;

        Employee dbEmployee = existingEmployee.get();

        // Updates fields if they are not null or empty.
        if (Objects.nonNull(employee.getEmployeeName()) && !Constants.BLANK_STRING.equalsIgnoreCase(employee.getEmployeeName())) {
            dbEmployee.setEmployeeName(employee.getEmployeeName());
        }
        if (Objects.nonNull(employee.getSalary())) {
            dbEmployee.setSalary(employee.getSalary());
        }
        if (Objects.nonNull(employee.getGender()) && dbEmployee.getGender()!=' ') {
            dbEmployee.setGender(employee.getGender());
        }
        if (Objects.nonNull(employee.getDepartmentName()) && !Constants.BLANK_STRING.equalsIgnoreCase(employee.getDepartmentName())) {
            dbEmployee.setDepartmentName(employee.getDepartmentName());
        }

        if (Objects.nonNull(employee.getEmail()) && !Constants.BLANK_STRING.equalsIgnoreCase(employee.getEmail())) {
            dbEmployee.setEmail(employee.getEmail());
        }

        return employeeRepository.save(dbEmployee);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee checkIfEmployeeExists(Long employeeId) {

        return  employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeNotExistException("Employee with id "+employeeId+ " does not exists"));
    }
}
