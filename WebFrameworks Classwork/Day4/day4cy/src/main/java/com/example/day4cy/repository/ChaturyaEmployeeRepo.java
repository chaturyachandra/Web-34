package com.example.day4cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4cy.model.ChaturyaEmployee;


@Repository
public interface ChaturyaEmployeeRepo extends JpaRepository<ChaturyaEmployee,Integer>{
    
}
