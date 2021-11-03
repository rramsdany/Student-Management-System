package com.projects.sms.service.impl;

import com.projects.sms.entity.Student;
import com.projects.sms.respository.StudentRepository;
import com.projects.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
