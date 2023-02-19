package ca.vanier.register.util;

import java.util.ArrayList;
import java.util.List;

import ca.vanier.register.entity.Course;
import ca.vanier.register.entity.Student;
import ca.vanier.register.entity.Teacher;

public class TestUtil {

    public static Course getCourseWithNoStudents() {
        Course course = new Course();
        course.setStudents(new ArrayList<Student>()); 
        return course;
    }
    
    public static Course getCourseWithStudentsAndTeacher() {
        Course course = new Course();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Aby","Dell","aby.dell@gmail.com"));
        students.add(new Student("Samantha","Well","samantha.well@aol.com"));
        course.setStudents(students); 
        Teacher teacher = new Teacher("Teddy","Vonn","teddy.vonn@microsoft.com");
        course.setTeacher(teacher);
        return course;
    }    
}
