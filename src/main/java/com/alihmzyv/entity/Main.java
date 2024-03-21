package com.alihmzyv.entity;

import com.alihmzyv.entity.embeddable.Name;
import com.alihmzyv.entity.proxy.*;
import jakarta.persistence.FlushModeType;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .addAnnotatedClass(com.alihmzyv.entity.proxy.Author.class)
                .addAnnotatedClass(com.alihmzyv.entity.proxy.Person.class)
                .addAnnotatedClass(com.alihmzyv.entity.proxy.Book.class)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        try (sessionFactory) {
            sessionFactory.inTransaction(session -> {
//                Name name = Name.builder()
//                        .firstName("ali")
//                        .lastName("hamzayev")
//                        .build();
//                Person person = Person.builder()
//                        .name(name)
//                        .build();
//                session.persist(person);
//                Author author = Author.builder()
//                        .person(person)
//                        .build();
//                session.persist(author);
//                session.flush();
//                session.clear();
//                Author authorRef1 = session.getReference(Author.class, 1L);
//                Person person = authorRef1.getPerson();
//                Set<Book> books = authorRef1.getBooks();
//                System.out.println("Is person initialized?: " + Hibernate.isInitialized(person));
//                System.out.println("Are books initialized: " + Hibernate.isInitialized(books));
//                Hibernate.initialize(person);
//                System.out.println("Is person initialized?: " + Hibernate.isInitialized(person));
//                Hibernate.initialize(books);
//                System.out.println("Are books initialized?: " + Hibernate.isInitialized(books));

//                //entity graph
//                var entityGraph = session.createEntityGraph(Author.class);
//                entityGraph.addSubgraph(Author_.PERSON);
//                entityGraph.addSubgraph(Author_.BOOKS);
//                Author author = session.byId(Author.class)
//                        .withFetchGraph(entityGraph)
//                        .load(1L);

                //flush
//                session.setHibernateFlushMode(FlushMode.COMMIT);
//                Name name = Name.builder()
//                        .firstName("Ali")
//                        .lastName("Hamzayev")
//                        .build();
//                Person person = Person.builder()
//                        .name(name)
//                        .build();
//                session.persist(person);
//                System.out.println("Person persisted");
//                Author author = Author.builder()
//                        .person(person)
//                        .build();
//                session.persist(author);
//                System.out.println("Author persisted");
//
//                Book book = Book.builder()
//                        .title("Hibernate")
//                        .author(author)
//                        .build();
//                session.persist(book);
//                System.out.println("Book persisted");
            });
        }
    }
}