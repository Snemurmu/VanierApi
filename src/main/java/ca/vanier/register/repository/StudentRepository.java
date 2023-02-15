package ca.vanier.register.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.register.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
