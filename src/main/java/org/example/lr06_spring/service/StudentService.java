package org.example.lr06_spring.service;

import org.example.lr06_spring.entity.Discipline;
import org.example.lr06_spring.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
