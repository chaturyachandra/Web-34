package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.ChaturyaStudent;

@Repository
public interface ChaturyaStudentRepository extends JpaRepository<ChaturyaStudent,Integer>{
    
}
