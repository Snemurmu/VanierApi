package ca.vanier.register.repository;

import org.springframework.data.repository.CrudRepository;

import ca.vanier.register.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
    
}
