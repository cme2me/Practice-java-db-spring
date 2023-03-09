package db.hibernate.dao;

import db.hibernate.entity.Student;

import java.util.List;
import java.util.UUID;

public interface StudentRepository {
    void save(Student student);
    void save(List<Student> students);
    void delete(UUID id);
    List<Student> findAll();
    Student findById(UUID id);

}
