package com.example.springapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.chaturya_STUD;
import com.example.springapp.service.chaturya_SERCLAS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class chaturya_C{
    @Autowired
    chaturya_SERCLAS studentService;
    @PostMapping("/student")
    public ResponseEntity<chaturya_STUD> addStudents(@RequestBody chaturya_STUD student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<chaturya_STUD>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<chaturya_STUD>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


