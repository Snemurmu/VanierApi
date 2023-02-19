package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.register.entity.Course;
import ca.vanier.register.entity.Student;
import ca.vanier.register.entity.Teacher;
import ca.vanier.register.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course save(Course course) {

        validateCourse(course);
        return courseRepository.save(course);
    }

    /**
     * This method validates the course
     * 
     * @param course
     * @return
     */
    @Override
    public boolean validateCourse(Course course) {
        List<Student> students = course.getStudents();

        if(students == null || students.size() == 0) {
            throw new RuntimeException("No student provied in the course");
        }

        if(students.size() > 30 ) {
            throw new RuntimeException("Too many students in the course");
        }

        Teacher teacher = course.getTeacher();
        if(teacher == null) {
            throw new RuntimeException("No teacher provied in the course");
        }

        return true;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course updateById(Course course, Long id) {
        Course newCourse = courseRepository.findById(id).get();

        return courseRepository.save(newCourse);
    }
    
}
