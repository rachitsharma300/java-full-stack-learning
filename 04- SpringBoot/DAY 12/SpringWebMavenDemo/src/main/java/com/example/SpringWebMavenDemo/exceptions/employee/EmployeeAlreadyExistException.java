package com.example.SpringWebMavenDemo.exceptions.employee;

public class EmployeeAlreadyExistException extends RuntimeException{
    public EmployeeAlreadyExistException(String message) {
        super(message);
    }
}
