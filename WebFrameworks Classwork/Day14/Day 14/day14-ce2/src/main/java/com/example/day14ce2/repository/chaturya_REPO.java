package com.example.day14ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.model.chaturya_P;

@Repository
public interface chaturya_REPO extends JpaRepository<chaturya_P,Integer> {
    
}
