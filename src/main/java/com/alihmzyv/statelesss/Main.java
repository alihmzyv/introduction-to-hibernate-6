package com.alihmzyv.statelesss;

import com.alihmzyv.entity.embeddable.Name;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;

public class Main {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        try (sessionFactory) {
            sessionFactory.inStatelessTransaction(session -> {
                com.alihmzyv.statelesss.Book book = com.alihmzyv.statelesss.Book.builder()
                        .title("Spring Boot")
                        .build();
                Name name = Name.builder()
                        .firstName("Ali")
                        .lastName("Hamzayev")
                        .build();
                Person person = Person.builder()
                        .name(name)
                        .build();
                com.alihmzyv.statelesss.Author author = com.alihmzyv.statelesss.Author.builder()
                        .books(Set.of(book))
                        .person(person)
                        .build();
                session.insert(book);
                session.insert(person);
                session.insert(author);
                System.out.println("Book, person, author inserted");
                session.get(Author.class, author.getId()); //direct access to db, while it would be present in context in case of Session
                book.setTitle("New title");
            });
        }
    }
}