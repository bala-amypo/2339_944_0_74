package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.newentity.StudentValidation;

public interface StudentRepository extends JpaRepository<StudentValidation, Long> {
}
