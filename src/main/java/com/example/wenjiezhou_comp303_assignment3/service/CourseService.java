/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.service;

import com.example.wenjiezhou_comp303_assignment3.model.Course;
import com.example.wenjiezhou_comp303_assignment3.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    // Link to course repository
    @Autowired
    private CourseRepository courseRepository;

    // Logic for CRUD operations for course
    public Iterable<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(int id) {
        return courseRepository.findById(id);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Optional<Course> updateCourse(int id, Course updatedCourse) {
        Optional<Course> searchedCourse = courseRepository.findById(id);
        if (searchedCourse.isPresent()) {
            updatedCourse.setCourseId(id);
            return Optional.of(courseRepository.save(updatedCourse));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteCourse(int id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
