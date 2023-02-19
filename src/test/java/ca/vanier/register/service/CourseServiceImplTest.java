package ca.vanier.register.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.vanier.register.entity.Course;
import ca.vanier.register.entity.Student;
import ca.vanier.register.util.TestUtil;

@SpringBootTest
public class CourseServiceImplTest {

    @Autowired
    private CourseService courseService;

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

    @Test
	void validateCourseWithNoStudents() {
        assertThrows(RuntimeException.class, () -> courseService.validateCourse(TestUtil.getCourseWithNoStudents()));
	}

    @Test
	void validateCourseWithStudentsAndTeacher() {
        assertTrue(courseService.validateCourse(TestUtil.getCourseWithStudentsAndTeacher()));
	}
}
