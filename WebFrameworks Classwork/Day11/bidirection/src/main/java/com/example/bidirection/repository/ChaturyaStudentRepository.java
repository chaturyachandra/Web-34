package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.ChaturyaStudent;



@Repository
public interface ChaturyaStudentRepository extends JpaRepository<ChaturyaStudent,Integer>{
    
}
