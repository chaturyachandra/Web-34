package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.ChaturyaPerson;
import com.example.springapp.repository.ChaturyaPersonRepo;

@Service
public class ChaturyaPersonService {
    public ChaturyaPersonRepo personRepo;

    public ChaturyaPersonService(ChaturyaPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(ChaturyaPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<ChaturyaPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
