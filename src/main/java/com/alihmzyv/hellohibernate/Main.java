package com.alihmzyv.hellohibernate;

import com.alihmzyv.hellohibernate.entity.Book;
import com.alihmzyv.hellohibernate.entity.Book2;
import com.alihmzyv.hellohibernate.entity.Book_;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import static java.lang.Boolean.TRUE;
import static java.lang.System.out;
import static org.hibernate.cfg.JdbcSettings.*;

public class Main {
    public static void main(String[] args) {
        var sessionFactory = new Configuration()
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Book2.class)
                .buildSessionFactory();

        try (sessionFactory) {
            // export the inferred database schema
            sessionFactory.getSchemaManager().exportMappedObjects(true);

            // persist an entity
            sessionFactory.inTransaction(session -> {
                session.persist(new Book("9781932394153", "Hibernate in Action"));
            });

            // query data using HQL
            sessionFactory.inSession(session -> {
                out.println(session.createQuery("select isbn||': '||title from BookWithNatualKey", Book.class).getSingleResult());
            });

            // query data using criteria API
            sessionFactory.inSession(session -> {
                var builder = sessionFactory.getCriteriaBuilder();
                var query = builder.createQuery(String.class);
                var book = query.from(Book.class);
                query.select(builder.concat(builder.concat(book.get(Book_.isbn), builder.literal(": ")),
                        book.get(Book_.title)));
                out.println(session.createSelectionQuery(query).getSingleResult());
            });
        }
    }
}