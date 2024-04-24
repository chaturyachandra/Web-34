package com.example.day4cw1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw1.model.ChaturyaMedicine;
import com.example.day4cw1.repository.ChaturyaMedicineRepo;

@Service
public class ChaturyaMedicineService {
    public ChaturyaMedicineRepo medicineRepo;
    public ChaturyaMedicineService(ChaturyaMedicineRepo medicineRepo)
    {
        this.medicineRepo = medicineRepo;
    }
    public boolean saveMedicine(ChaturyaMedicine medicine)
    {
        try{
            medicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaMedicine> getMedicines()
    {
        return medicineRepo.findAll();
    }

    public ChaturyaMedicine MedicineById(int id)
    {
        Optional<ChaturyaMedicine> obj = medicineRepo.findById(id);
        return obj.orElse(new ChaturyaMedicine());
    }

}
