/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Mar 29, 2024
*/

package com.example.wenjiezhou_comp303_assignment3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "student")
public class Student {

    // Auto-generate ID by MySQL database
    @Id
    @Column(name = "studentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "firstname")
    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @Column(name = "lastname")
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @Column(name = "dob")
    @NotNull(message = "Date of birth is mandatory")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @Column(name = "gender")
    @NotBlank(message = "Gender is mandatory")
    private String gender;

    @Column(name = "nationality")
    @NotBlank(message = "Nationality is mandatory")
    private String nationality;

    @Column(name = "address")
    @NotBlank(message = "Address is mandatory")
    private String address;

    @Column(name = "phone")
    @NotBlank(message = "Phone number is mandatory")
    private String phone;

    @Column(name = "email")
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Please use email format")
    private String email;
}
