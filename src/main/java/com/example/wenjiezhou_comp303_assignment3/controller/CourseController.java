/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.controller;

import com.example.wenjiezhou_comp303_assignment3.model.Course;
import com.example.wenjiezhou_comp303_assignment3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    // Link to course service layer
    @Autowired
    private CourseService courseService;

    // CRUD operations for course
    @GetMapping
    public Iterable<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/{id}")
    public Optional<Course> updateCourse(@PathVariable int id, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(id, updatedCourse);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }
}
