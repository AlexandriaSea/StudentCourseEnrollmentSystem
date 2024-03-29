/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "course")
public class Course {

    // Auto-generate ID by MySQL database
    @Id
    @Column(name = "courseid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name = "code")
    @NotBlank(message = "Course code is mandatory")
    private String code;

    @Column(name = "title")
    @NotBlank(message = "Course title is mandatory")
    private String title;

    @Column(name = "hour")
    @NotNull(message = "Course hour is mandatory")
    private int hour;

    @Column(name = "campus")
    @NotBlank(message = "Campus is mandatory")
    private String campus;

    @Column(name = "method")
    @NotBlank(message = "Course method is mandatory")
    private String method;

    @Column(name = "doc")
    @NotNull(message = "Date of creation is mandatory")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate doc;

    @Column(name = "professor")
    @NotBlank(message = "Course professor is mandatory")
    private String professor;
}
