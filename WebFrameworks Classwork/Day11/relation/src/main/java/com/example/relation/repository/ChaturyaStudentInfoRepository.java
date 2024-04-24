package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.ChaturyaStudentInfo;

@Repository
public interface ChaturyaStudentInfoRepository extends JpaRepository<ChaturyaStudentInfo,Integer>{
    
}