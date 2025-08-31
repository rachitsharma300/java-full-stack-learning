package com.example.springTask.repository;

import com.example.springTask.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository layer (MongoDB access).
 * Direct Mapping CURD Operation on MongoDB
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
