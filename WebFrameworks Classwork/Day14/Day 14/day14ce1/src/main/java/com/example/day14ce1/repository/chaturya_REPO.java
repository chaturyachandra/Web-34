package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.chaturya_C;

@Repository
public interface chaturya_REPO extends JpaRepository<chaturya_C,Long> {
    
}
