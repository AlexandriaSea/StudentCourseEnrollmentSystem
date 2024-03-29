/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.service;

import com.example.wenjiezhou_comp303_assignment3.model.Enrollment;
import com.example.wenjiezhou_comp303_assignment3.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnrollmentService {

    // Link to enrollment repository
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    // Logic for CRUD operations for enrollment
    public Iterable<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(int id) {
        return enrollmentRepository.findById(id);
    }

    public Enrollment addEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public Optional<Enrollment> updateEnrollment(int id, Enrollment updatedEnrollment) {
        Optional<Enrollment> searchedEnrollment = enrollmentRepository.findById(id);
        if (searchedEnrollment.isPresent()) {
            updatedEnrollment.setEnrollmentId(id);
            return Optional.of(enrollmentRepository.save(updatedEnrollment));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteEnrollment(int id) {
        if (enrollmentRepository.existsById(id)) {
            enrollmentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
