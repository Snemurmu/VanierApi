package ca.vanier.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.register.entity.Student;
import ca.vanier.register.service.StudentService;


@RestController
@RequestMapping("/vanier")
public class RegistrationController {

    @Autowired
    private StudentService studentService;
    
    @PostMapping("/student/save")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student/list")
    public List<Student> listStudents() {
        return studentService.findAll();
    }

}
