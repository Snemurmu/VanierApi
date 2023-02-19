package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import ca.vanier.register.entity.Course;

public interface CourseService {

    Course save(Course course);

    List<Course> findAll();

    Optional<Course> findById(Long id);

    void deleteById(Long id);

    Course updateById(Course course, Long id);

}

