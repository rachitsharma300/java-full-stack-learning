package com.example.SpringWebMavenDemo.repository.employee;

import com.example.SpringWebMavenDemo.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
