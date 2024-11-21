package com.dgmf.assertions;

import com.dgmf.Student;
import com.dgmf.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Test
    public void getStudentsTest() {
        // TEST LOGIC
        StudentService studentService = new StudentService();

        Student student = new Student(1, "John Doe");

        List<Student> listOfStudents = studentService.getStudents();

        studentService.addStudent(student);

        boolean actualResult = listOfStudents.isEmpty();

        // ASSERTIONS ==> Different "assertTrue()" Methods Use Cases
        // assertTrue(actualResult);

        // BooleanSupplier Interface
        // assertTrue(() -> actualResult);

        // Display the Custom Message when the Test failed
        // assertTrue(actualResult, "List of Students is Empty");

        // Display the Custom Message when the Test failed
        // assertTrue(() -> actualResult, "List of Students is Empty");

        // Display the Custom Message when the Test failed
        // assertTrue(actualResult, () -> "List of Students is Empty");

        // Display the Custom Message when the Test failed
        assertTrue(() -> actualResult, () -> "List of Students is Empty");
    }
}