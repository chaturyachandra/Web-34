package com.example.day14ce1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.chaturya_C;
import com.example.day14ce1.service.chaturya_E;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class chaturya_CON {
    @Autowired
    chaturya_E employeeService;

    @PostMapping("/employee")
    public chaturya_C addEmployee(@RequestBody chaturya_C employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<chaturya_C> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<chaturya_C> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
