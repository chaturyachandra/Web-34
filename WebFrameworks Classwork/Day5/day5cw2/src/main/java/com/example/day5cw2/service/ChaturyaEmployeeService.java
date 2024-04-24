package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.ChaturyaEmployee;
import com.example.day5cw2.repository.ChaturyaEmployeeRepo;

@Service
public class ChaturyaEmployeeService {
    public ChaturyaEmployeeRepo employeeRepo;
    public ChaturyaEmployeeService(ChaturyaEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(ChaturyaEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ChaturyaEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public ChaturyaEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
