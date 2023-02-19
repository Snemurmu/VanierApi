package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import ca.vanier.register.entity.Teacher;

public interface TeacherService {

    Teacher save(Teacher teacher);

    List<Teacher> findAll();

    Optional<Teacher> findById(Long id);

    void deleteById(Long id);

    Teacher updateById(Teacher teacher, Long id);

}

