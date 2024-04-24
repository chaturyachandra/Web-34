package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.ChaturyaStudent;
import com.example.relation.service.ChaturyaStudentService;
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
    @PostMapping("/api/student")
    public ChaturyaStudent postMethodName(@RequestBody ChaturyaStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<ChaturyaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
