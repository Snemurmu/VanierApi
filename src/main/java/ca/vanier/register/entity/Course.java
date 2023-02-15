package ca.vanier.register.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    private Teacher teacher;

    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Student> students;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Teacher getTeacher() {
        return teacher;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public List<Student> getStudents() {
        return students;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
