package com.alihmzyv.entity;

import com.alihmzyv.entity.association.manytomany.AuthorMM;
import com.alihmzyv.entity.association.manytomany.BookMM;
import com.alihmzyv.entity.association.onetomany.Publisher;
import com.alihmzyv.entity.association.onetoone.firstway.Author;
import com.alihmzyv.entity.association.onetoone.firstway.Person;
import com.alihmzyv.entity.association.onetoone.mapsid.AuthorMapsId;
import com.alihmzyv.entity.association.onetoone.mapsid.PersonMapsId;
import com.alihmzyv.entity.embeddable.Name;
import com.alihmzyv.entity.objectrelationalmapping.joinedtable.Animal;
import com.alihmzyv.entity.objectrelationalmapping.joinedtable.Pet;
import com.alihmzyv.entity.objectrelationalmapping.singletable.Book;
import com.alihmzyv.entity.objectrelationalmapping.singletable.Pen;
import com.alihmzyv.entity.objectrelationalmapping.singletable.Product;
import com.alihmzyv.entity.objectrelationalmapping.tableperclass.MotorVehicle;
import com.alihmzyv.entity.objectrelationalmapping.tableperclass.Vehicle;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var sessionFactory = new Configuration()
//                .addAnnotatedClass(Publisher.class)
//                .addAnnotatedClass(Book.class)
//                .addAnnotatedClass(Author.class)
//                .addAnnotatedClass(AuthorMM.class)
//                .addAnnotatedClass(BookMM.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Pen.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Animal.class)
                .addAnnotatedClass(MotorVehicle.class)
                .addAnnotatedClass(Vehicle.class)
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
//            sessionFactory.inTransaction(session -> {
//                Name name = Name.builder()
//                        .firstName("Ali")
//                        .lastName("Hamzayev")
//                        .build();
//                Person person = Person.builder()
//                        .name(name)
//                        .build();
//                Author author = Author.builder()
//                        .person(person)
//                        .build();
//                session.persist(person);
//                session.persist(author);
//            });
//            sessionFactory.inSession(session -> session.createQuery("select p from Person p", Person.class)
//                    .getResultList()
//                    .forEach(person -> {
//                        System.out.println(person.getName());
////                        System.out.println(person.getAuthor());
//                    }));
//            sessionFactory.inSession(session -> {
//                Publisher publisher = session.get(Publisher.class, 1L);
//                System.out.println(publisher);
//            });
//            sessionFactory.inTransaction(session -> {
//                BookMM book = BookMM.builder()
//                        .build();
//                AuthorMM author = AuthorMM.builder()
//                        .books(Set.of(book))
//                        .build();
//                session.persist(book);
//                session.persist(author);
//            });
//
//            sessionFactory.inTransaction(session -> {
//                AuthorMM author = session.get(AuthorMM.class, 1L);
//                author.getBooks().clear();
//            });
            sessionFactory.inSession(session -> {
                List<Product> products = session.createQuery("from Product", Product.class)
                        .getResultList();
                List<Pet> pets = session.createQuery("from Pet", Pet.class)
                        .getResultList();
                List<Vehicle> vehicles = session.createQuery("from Vehicle", Vehicle.class)
                        .getResultList();
            });
        }
    }
}