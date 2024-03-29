/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.service;

import com.example.wenjiezhou_comp303_assignment3.model.Student;
import com.example.wenjiezhou_comp303_assignment3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    // Link to student repository
    @Autowired
    private StudentRepository studentRepository;

    // Logic for CRUD operations for student
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(int id, Student updatedStudent) {
        Optional<Student> searchedStudent = studentRepository.findById(id);
        if (searchedStudent.isPresent()) {
            updatedStudent.setStudentId(id);
            return Optional.of(studentRepository.save(updatedStudent));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteStudent(int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
