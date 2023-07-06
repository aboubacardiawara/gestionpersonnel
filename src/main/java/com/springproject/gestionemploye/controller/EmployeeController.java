package com.springproject.gestionemploye.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.gestionemploye.model.Employee;
import com.springproject.gestionemploye.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> employees = employeeService.getEmployees();
        System.out.println("Employees: " + employees);
        model.addAttribute("employees", employees);
        return "home";
    }

}
