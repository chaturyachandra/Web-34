package com.example.day4cy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4cy.model.ChaturyaEmployee;
import com.example.day4cy.service.ChaturyaEmployeeService;

@RestController
public class ChaturyaEmployeeController {
    public ChaturyaEmployeeService employeeService;
    public ChaturyaEmployeeController(ChaturyaEmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<ChaturyaEmployee> postMethodName(@RequestBody ChaturyaEmployee employee) {
        if(employeeService.saveEmployee(employee))
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/employee")
    public ResponseEntity<List<ChaturyaEmployee>> getMethodName() {
        List<ChaturyaEmployee> list =  employeeService.getEmployees();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @GetMapping("/api/employee/{employeeId}")
    public ResponseEntity<ChaturyaEmployee> getMethodName(@PathVariable("employeeId") int id) {
        ChaturyaEmployee p =  employeeService.getEmployeeById(id);
        if(p==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
}
