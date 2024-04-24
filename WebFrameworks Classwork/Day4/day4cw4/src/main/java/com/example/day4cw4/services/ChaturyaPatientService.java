package com.example.day4cw4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw4.model.ChaturyaPatient;
import com.example.day4cw4.repository.ChaturyaPatientRepo;

@Service
public class ChaturyaPatientService {
    public ChaturyaPatientRepo patientRepo;
    public ChaturyaPatientService(ChaturyaPatientRepo patientRepo)
    {
        this.patientRepo = patientRepo;
    }
    public boolean savePatient(ChaturyaPatient patient)
    {
        try{
            patientRepo.save(patient);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaPatient> getPatients()
    {
        return patientRepo.findAll();
    }
    public ChaturyaPatient getPatientById(int id)
    {
        Optional<ChaturyaPatient> obj = patientRepo.findById(id);
        return obj.orElse(null);
    }
}
