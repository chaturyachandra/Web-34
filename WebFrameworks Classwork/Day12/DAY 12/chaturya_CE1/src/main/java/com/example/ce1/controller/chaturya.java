package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.chaturya_MO;
import com.example.ce1.service.chaturya_A;

@RestController
public class chaturya {
    @Autowired
    chaturya_A employeeService;

    @PostMapping("/employee")
    public chaturya_MO setMethod(@RequestBody chaturya_MO employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<chaturya_MO> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<chaturya_MO> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
