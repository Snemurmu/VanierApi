package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import ca.vanier.register.entity.Student;

public interface StudentService {

    Student save(Student student);

    List<Student> findAll();

    Optional<Student> findById(Long id);

    void deleteById(Long id);

    Student updateById(Student student, Long id);

}
