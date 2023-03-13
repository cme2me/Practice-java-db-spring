package com.example.max.db.hibernate.dao;

import com.example.max.db.hibernate.entity.Student;
import com.example.max.db.hibernate.util.HibernateSessionUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.UUID;

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void save(Student student) {
        try (Session session = HibernateSessionUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        }

    }
    @Override
    public void save(List<Student> students) {
        try (Session session = HibernateSessionUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            for (int i = 0 ; i < students.size(); i++) {
                session.save(students.get(i));
                if (i % 100 == 0) {
                    session.flush();
                    session.clear();
                }
            }
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(UUID id) {
        try (Session session = HibernateSessionUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            var studentToDelete = session.get(Student.class, id);
            session.delete(studentToDelete);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Student> findAll() {
        try (Session session = HibernateSessionUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            List<Student> students = session.createQuery("select s from Student s").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    @Override
    public Student findById(UUID id) {
        try (Session session = HibernateSessionUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            var student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }
}