package org.example.btvn_buoi3.service;

import org.example.btvn_buoi3.Repository.StudentRepository;
import org.example.btvn_buoi3.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentIMPL implements StudentService {
    private final StudentRepository studentRepository;

    public StudentIMPL(StudentRepository studentRepository) {
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
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}