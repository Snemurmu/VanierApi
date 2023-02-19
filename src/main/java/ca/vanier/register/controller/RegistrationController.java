package ca.vanier.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.register.entity.Course;
import ca.vanier.register.entity.Student;
import ca.vanier.register.service.CourseService;
import ca.vanier.register.service.StudentService;


@RestController
@RequestMapping("/vanier")
public class RegistrationController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @PostMapping("/student/save")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student/list")
    public List<Student> listStudents() {
        return studentService.findAll();
    }

    @PostMapping("/course/save")
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping("/course/list")
    public List<Course> listCourses() {
        return courseService.findAll();
    }

}
