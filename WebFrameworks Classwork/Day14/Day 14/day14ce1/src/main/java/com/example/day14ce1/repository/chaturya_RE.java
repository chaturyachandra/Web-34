package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.chaturya_W;

@Repository
public interface chaturya_RE extends JpaRepository<chaturya_W,Long> {
    
}
