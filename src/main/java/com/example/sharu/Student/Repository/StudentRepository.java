package com.example.sharu.Student.Repository;

import java.util.List;

import com.example.sharu.Student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Long> {
}
