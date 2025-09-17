package com.example.SpringWebMavenDemo.entity.department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a Department entity in the application.
 */
@Entity
@Data // Generates getters, setters, toString, equals, and hashCode methods.
@NoArgsConstructor // Generates a no-args constructor.
@AllArgsConstructor // Generates a constructor with all arguments.
@Builder // Generates a builder pattern for creating instances.
public class Department {
    @Id // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the primary key value.
    private Long departmentId; // Unique identifier for the department.

    @NotBlank(message = "Department name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String departmentName; // Name of the department.

    @NotBlank(message = "Address is required")
    @Size(min = 5, max = 100, message = "Address must be between 5 and 100 characters")
    private String departmentAddress; // Address of the department.

    @NotBlank(message = "Code is required")
    @Size(min = 2, max = 10, message = "Code must be between 2 and 10 characters")
    private String departmentCode; // Code representing the department.


    @NotBlank(message = "Department EmailId is required")
    @Email
    private String departmentEmailId;

}