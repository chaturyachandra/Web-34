package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class chaturya_STUD {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    @OneToOne(mappedBy="student",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JsonManagedReference
    GUNESHWAR_C studentDetail;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public GUNESHWAR_C getStudentDetail() {
        return studentDetail;
    }
    public void setStudentDetail(GUNESHWAR_C studentDetail) {
        this.studentDetail = studentDetail;
    }
    
    
    
}
