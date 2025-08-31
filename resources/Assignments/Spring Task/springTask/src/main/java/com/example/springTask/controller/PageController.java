package com.example.springTask.controller;

import com.example.springTask.model.Employee;
import com.example.springTask.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for serving HTML pages (Thymeleaf).
 * this class helpful for UI pages
 */
@Controller
public class PageController {

    private final EmployeeService service;

    public PageController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("employee", new Employee());
        return "index"; // loads templates/index.html
    }

    @PostMapping("/form-submit")
    public String formSubmit(@Valid @ModelAttribute("employee") Employee employee,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        service.create(employee);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    public String displayAll(Model model) {
        model.addAttribute("employees", service.findAll());
        return "list"; // loads templates/list.html
    }

    @GetMapping("/display/{id}")
    public String displayOne(@PathVariable String id, Model model) {
        model.addAttribute("employee", service.findById(id));
        model.addAttribute("employeeId", id);
        return "detail"; // loads templates/detail.html
    }
}
