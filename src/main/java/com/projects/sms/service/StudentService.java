package com.projects.sms.service;

import com.projects.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
