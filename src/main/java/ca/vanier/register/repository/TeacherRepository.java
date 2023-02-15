package ca.vanier.register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.register.entity.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    
}
