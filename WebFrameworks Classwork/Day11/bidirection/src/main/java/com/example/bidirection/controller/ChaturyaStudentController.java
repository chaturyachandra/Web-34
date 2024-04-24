package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.ChaturyaStudent;
import com.example.bidirection.model.ChaturyaStudentInfo;
import com.example.bidirection.service.ChaturyaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ChaturyaStudentController {
    public ChaturyaStudentService studentService;
    public ChaturyaStudentController(ChaturyaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public ChaturyaStudent postMethodName(@RequestBody ChaturyaStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public ChaturyaStudentInfo postMethodName(@RequestBody ChaturyaStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<ChaturyaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}