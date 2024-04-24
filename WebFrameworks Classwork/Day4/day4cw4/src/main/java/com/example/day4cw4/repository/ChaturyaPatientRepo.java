package com.example.day4cw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4cw4.model.ChaturyaPatient;

@Repository
public interface ChaturyaPatientRepo extends JpaRepository<ChaturyaPatient,Integer>{
    
}
