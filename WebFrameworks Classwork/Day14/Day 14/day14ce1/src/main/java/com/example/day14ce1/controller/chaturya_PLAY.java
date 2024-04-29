package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.chaturya_W;
import com.example.day14ce1.service.chaturya_D;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class chaturya_PLAY {
    @Autowired
    chaturya_D PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public chaturya_W addPayroll(@PathVariable Long employeeId,@RequestBody chaturya_W payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<chaturya_W> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
