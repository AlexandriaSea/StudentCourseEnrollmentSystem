/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.controller;

import com.example.wenjiezhou_comp303_assignment3.model.Enrollment;
import com.example.wenjiezhou_comp303_assignment3.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    // Link to enrollment service layer
    @Autowired
    private EnrollmentService enrollmentService;

    // CRUD operations for enrollment
    @GetMapping
    public Iterable<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getEnrollmentById(@PathVariable int id) {
        return enrollmentService.getEnrollmentById(id);
    }

    @PostMapping
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.addEnrollment(enrollment);
    }

    @PutMapping("/{id}")
    public Optional<Enrollment> updateEnrollment(@PathVariable int id, @RequestBody Enrollment updatedEnrollment) {
        return enrollmentService.updateEnrollment(id, updatedEnrollment);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEnrollment(@PathVariable int id) {
        return enrollmentService.deleteEnrollment(id);
    }
}
