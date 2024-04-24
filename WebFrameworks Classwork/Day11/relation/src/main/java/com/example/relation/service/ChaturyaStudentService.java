package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.ChaturyaStudent;
import com.example.relation.repository.ChaturyaStudentRepository;

@Service
public class ChaturyaStudentService {
    public ChaturyaStudentRepository studentRepository;
    public ChaturyaStudentService(ChaturyaStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public ChaturyaStudent saveStudent(ChaturyaStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ChaturyaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
