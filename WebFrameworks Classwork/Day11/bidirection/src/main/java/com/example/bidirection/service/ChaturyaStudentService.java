package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.ChaturyaStudent;
import com.example.bidirection.model.ChaturyaStudentInfo;
import com.example.bidirection.repository.ChaturyaStudentInfoRepository;
import com.example.bidirection.repository.ChaturyaStudentRepository;

@Service
public class ChaturyaStudentService {
    public ChaturyaStudentRepository studentRepository;
    public ChaturyaStudentInfoRepository studentInfoRepository;
    public ChaturyaStudentService(ChaturyaStudentRepository studentRepository,ChaturyaStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public ChaturyaStudent saveStudent(ChaturyaStudent student)
    {
        return studentRepository.save(student);
    }
    public ChaturyaStudentInfo saveStudentInfo(ChaturyaStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<ChaturyaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
