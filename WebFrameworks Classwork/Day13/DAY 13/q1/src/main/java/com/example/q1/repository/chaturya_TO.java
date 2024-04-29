package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.chaturya_HO;
@Repository
public interface chaturya_TO extends JpaRepository<chaturya_HO, Long> {
}
