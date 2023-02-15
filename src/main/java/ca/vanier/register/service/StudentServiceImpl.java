package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.register.entity.Student;
import ca.vanier.register.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateById(Student student, Long id) {
        Student newStudent = studentRepository.findById(id).get();

        // Validation

        newStudent.setFname(student.getFname());
        newStudent.setLname(student.getLname());
        newStudent.setEmail(student.getEmail());

        return studentRepository.save(newStudent);
    }

    
}
