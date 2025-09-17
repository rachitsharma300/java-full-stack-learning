package com.example.SpringWebMavenDemo.repository.employee;

import com.example.SpringWebMavenDemo.entity.employee.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findEmployeeByEmail(String email);

    @Query(value = "select * from dcbapp.employee where department_name = :deptName order by salary desc limit 2;", nativeQuery = true)
    List<Employee> findTop2EmployeesWithHighestSalary(@Param("deptName") String departmentName);

//    List<Employee> findTop2ByDepartmentNameOrderBySalaryDesc(String departmentName);
}
