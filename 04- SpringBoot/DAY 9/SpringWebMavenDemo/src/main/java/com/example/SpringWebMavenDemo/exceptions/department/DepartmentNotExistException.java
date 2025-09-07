package com.example.SpringWebMavenDemo.exceptions.department;

public class DepartmentNotExistException extends RuntimeException{
    public DepartmentNotExistException(String message) {
        super(message);
    }
}
