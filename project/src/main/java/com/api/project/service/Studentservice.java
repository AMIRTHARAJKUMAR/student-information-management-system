package com.api.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.project.entity.Student;
import com.api.project.repository.StudentRepository;

@Service

public class Studentservice
{
	@Autowired
	StudentRepository studentrepository;
	public  Student saveinfo(Student student)
	{
		return  studentrepository.save(student);
	}
	public List<Student> showinfo()
	{
		return  studentrepository.findAll();
	}

}
