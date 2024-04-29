package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.chaturya_MO;
import com.example.ce1.repository.chaturya_REPO;

@Service
public class chaturya_A {
    @Autowired
    chaturya_REPO employeeRepo;

    @SuppressWarnings("null")
    public chaturya_MO setEmployee(chaturya_MO employee)
    {
        return employeeRepo.save(employee);
    }

    public List<chaturya_MO> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<chaturya_MO> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
