package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.chaturya_W;
import com.example.day14ce1.repository.chaturya_RE;

@Service
public class chaturya_D {
    @Autowired
    chaturya_RE payrollRepo;

    public chaturya_W addPayroll(Long id,chaturya_W payroll)
    {
        chaturya_W avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<chaturya_W> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
