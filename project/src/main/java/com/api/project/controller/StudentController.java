package com.api.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.project.entity.Student;
import com.api.project.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() 
    {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }
}
