package com.example.SpringWebMavenDemo.controller.department;

import com.example.SpringWebMavenDemo.entity.department.Department;
import com.example.SpringWebMavenDemo.exceptions.department.DepartmentNotExistException;
import com.example.SpringWebMavenDemo.service.department.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
public class DepartmentViewController {

    @Autowired
    private DepartmentService departmentService;

    // Show all departments
    @GetMapping
    public String listDepartments(Model model) {
        model.addAttribute("fetchedDepartments", departmentService.fetchDepartmentList());
        return "department/list";
    }

    // Show form for creating new department
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("department", new Department());
        return "department/form";
    }

    // Save new department
    @PostMapping
    public String saveDepartment(@Valid @ModelAttribute("department") Department department,
                                 BindingResult result) {
        if (result.hasErrors()) {
            return "department/form"; // re-show form with errors
        }
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }

    // Show form for editing department
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Department dept = departmentService.fetchDepartmentById(id);
        model.addAttribute("department", dept);
        return "department/form";
    }

    // Update existing department
    @PostMapping("/{id}")
    public String updateDepartment(@PathVariable("id") Long id,
                                   @Valid @ModelAttribute("department") Department department,
                                   BindingResult result) {
        if (result.hasErrors()) {
            return "department/form"; // re-show form with errors
        }
        departmentService.updateDepartment(department, id);
        return "redirect:/departments";
    }

    // Delete department
    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable("id") Long id) {
        departmentService.deleteDepartmentById(id);
        return "redirect:/departments";
    }

    @ExceptionHandler(DepartmentNotExistException.class)
    public ResponseEntity<String> handleNotFound(DepartmentNotExistException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Getting exception :"+ex.getMessage());
    }

}
