package db.hibernate.service;

import db.hibernate.util.HibernateSessionUtil;
import db.hibernate.dao.StudentRepository;
import db.hibernate.dao.StudentRepositoryImpl;
import db.hibernate.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//pseudo service
public class StudentService {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        HibernateSessionUtil.getSessionFactory().getCurrentSession();
        final UUID UUID_TO_FIND_AND_DELETE = UUID.randomUUID();

        try {
            studentRepository.save(new Student(UUID_TO_FIND_AND_DELETE, "Max", 3));

            studentRepository.findById(UUID_TO_FIND_AND_DELETE);

            studentRepository.findAll();

            studentRepository.delete(UUID_TO_FIND_AND_DELETE);

        } finally {
            HibernateSessionUtil.shutDown();
        }

        HibernateSessionUtil.getSessionFactory().openSession();
        try {
            List<Student> students = new ArrayList<>(1000);
            for (int i = 0; i < 1000; i++) {
                students.add(new Student(UUID.randomUUID(), "Test", 1));
            }
            studentRepository.save(students);

        } finally {
            HibernateSessionUtil.shutDown();
        }
    }

}
