package com.example.SpringWebMavenDemo.repository;


import com.example.SpringWebMavenDemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicates that this interface is a Spring Data repository.
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}