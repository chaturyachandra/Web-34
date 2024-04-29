package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.chaturya_C;
import com.example.day14ce1.repository.chaturya_REPO;

@Service

public class chaturya_E {
    @Autowired
    chaturya_REPO employeeRepo;

    public chaturya_C addEmployee(chaturya_C employee)
    {
        return employeeRepo.save(employee);
    }

    public List<chaturya_C> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<chaturya_C> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
