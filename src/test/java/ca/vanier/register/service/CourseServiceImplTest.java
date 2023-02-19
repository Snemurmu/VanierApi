package ca.vanier.register.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ca.vanier.register.entity.Course;
import ca.vanier.register.entity.Student;

public class CourseServiceImplTest {

    private Course course;

    @BeforeEach
    void init() {
        course = new Course();
        course.setStudents(new ArrayList<Student>());
    }

    @Test
	void validateCourse() {
        List<Student> students = course.getStudents();
        assertEquals(students.size(), 0);
	}
    
}
