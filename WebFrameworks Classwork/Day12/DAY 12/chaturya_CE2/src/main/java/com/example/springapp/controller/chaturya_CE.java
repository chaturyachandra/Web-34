package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.chaturya_STUD;
import com.example.springapp.service.chaturya_O;

@RestController
public class chaturya_CE {
    @Autowired
    chaturya_O studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<chaturya_C> addStudentDetails(@PathVariable int id,@RequestBody chaturya_C studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
