package com.api.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
