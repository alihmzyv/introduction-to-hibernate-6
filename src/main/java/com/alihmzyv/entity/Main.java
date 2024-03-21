package com.alihmzyv.entity;

import com.alihmzyv.entity.test.Author;
import com.alihmzyv.entity.test.Reader_;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        var sessionFactory = new Configuration()
                .addAnnotatedClass(com.alihmzyv.entity.test.Author.class)
                .addAnnotatedClass(com.alihmzyv.entity.test.Reader.class)
                .addAnnotatedClass(com.alihmzyv.entity.test.Person.class)
                .buildSessionFactory();
        try (sessionFactory) {
//            sessionFactory.inTransaction(session -> {
//                Student student = new Student();
//                student.setRegisteredAt(Instant.now().toEpochMilli());
//                session.persist(student);
//            });
//
//            sessionFactory.inSession(session -> {
//                session.createQuery("select s from Student s", Student.class)
//                        .getResultList()
//                        .forEach(System.out::println);
//            });
        }
    }
}