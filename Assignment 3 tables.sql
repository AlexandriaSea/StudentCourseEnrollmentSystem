use centennial;
CREATE TABLE student(
    studentId SMALLINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstName varchar(20) NOT NULL,
    lastName varchar(20) NOT NULL,
    dob date NOT NULL,
    gender varchar(20) NOT NULL,
    nationality varchar(20) NOT NULL,
    address varchar(100) NOT NULL,
    phone varchar(50) NOT NULL,
    email varchar(50) NOT NULL
);

use centennial;
CREATE TABLE course(
    courseId SMALLINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    code varchar(20) NOT NULL,
    title varchar(50) NOT NULL,
    hour SMALLINT NOT NULL,
    campus varchar(50) NOT NULL,
    method varchar(20) NOT NULL,
    doc date NOT NULL,
    professor varchar(50) NOT NULL
);

use centennial;
CREATE TABLE enrollment(
    enrollmentId SMALLINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    studentId SMALLINT NOT NULL,
    courseId SMALLINT NOT NULL,
    term varchar(30) NOT NULL,
    FOREIGN KEY (studentId) REFERENCES student(studentId),
    FOREIGN KEY (courseId) REFERENCES course(courseId)
);
