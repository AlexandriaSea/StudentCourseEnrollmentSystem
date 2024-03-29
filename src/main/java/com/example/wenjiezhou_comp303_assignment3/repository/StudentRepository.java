/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.repository;

import com.example.wenjiezhou_comp303_assignment3.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
