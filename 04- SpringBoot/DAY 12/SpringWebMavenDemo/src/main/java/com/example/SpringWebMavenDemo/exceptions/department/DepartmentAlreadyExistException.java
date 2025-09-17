package com.example.SpringWebMavenDemo.exceptions.department;

public class DepartmentAlreadyExistException extends RuntimeException{
    public DepartmentAlreadyExistException(String message) {
        super(message);
    }
}
