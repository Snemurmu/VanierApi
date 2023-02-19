package ca.vanier.register.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.register.entity.Teacher;
import ca.vanier.register.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher save(Teacher course) {
        return teacherRepository.save(course);
    }

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher updateById(Teacher teacher, Long id) {
        Teacher newTeacher = teacherRepository.findById(id).get();

        // Validation

        newTeacher.setFname(teacher.getFname());
        newTeacher.setLname(teacher.getLname());
        newTeacher.setEmail(teacher.getEmail());

        return teacherRepository.save(newTeacher);
    }

    
}
