package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.chaturya_MOD;
import com.example.ce1.repository.chaturya_R;
import com.example.ce1.repository.chaturya_REPO;

@Service
public class chaturya_S {
    @Autowired
    chaturya_R addressRepo;
    @Autowired
    chaturya_REPO employeeRepo;
    public chaturya_MOD setAddressById(int id,chaturya_MOD address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
