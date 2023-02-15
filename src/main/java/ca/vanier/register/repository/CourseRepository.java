package ca.vanier.register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.register.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    
}
