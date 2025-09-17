package com.example.SpringWebMavenDemo.exceptions.employee;

public class EmployeeNotExistException extends RuntimeException{
    public EmployeeNotExistException(String message) {
        super(message);
    }
}
