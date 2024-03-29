/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "enrollment")
public class Enrollment {

    // Auto-generate ID by MySQL database
    @Id
    @Column(name = "enrollmentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enrollmentId;

    // Link to student table using foreign key of studentId
    @ManyToOne
    @JoinColumn(name = "studentid", referencedColumnName = "studentid")
    private Student student;

    // Link to course table using foreign key of courseId
    @ManyToOne
    @JoinColumn(name = "courseid", referencedColumnName = "courseid")
    private Course course;

    @Column(name = "term")
    @NotBlank(message = "Term is mandatory")
    private String term;
}
