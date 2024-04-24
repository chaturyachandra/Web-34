package com.example.day4cy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cy.model.ChaturyaEmployee;
import com.example.day4cy.repository.ChaturyaEmployeeRepo;

@Service
public class ChaturyaEmployeeService {
    public ChaturyaEmployeeRepo employeeRepo;
    public ChaturyaEmployeeService(ChaturyaEmployeeRepo employeeRepo)
    {
        this.employeeRepo=employeeRepo;
    }
    public boolean saveEmployee(ChaturyaEmployee employee)
    {
        try{
            employeeRepo.save(employee);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }
    public ChaturyaEmployee getEmployeeById(int id)
    {
        Optional<ChaturyaEmployee> obj = employeeRepo.findById(id);
        return obj.orElse(null);
    }
}
