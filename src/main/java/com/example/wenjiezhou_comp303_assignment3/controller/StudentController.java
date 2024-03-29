/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.controller;

import com.example.wenjiezhou_comp303_assignment3.service.StudentService;
import com.example.wenjiezhou_comp303_assignment3.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    // Link to student service layer
    @Autowired
    private StudentService studentService;

    // CRUD operations for student
    @GetMapping
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public Optional<Student> updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
