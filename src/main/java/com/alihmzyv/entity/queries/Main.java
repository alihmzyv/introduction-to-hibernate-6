package com.alihmzyv.entity.queries;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Order;
import org.hibernate.query.Page;

import java.util.List;

public class Main {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        try (sessionFactory) {
            sessionFactory.inTransaction(session -> {
                //HQL or JPQL
//                List<Book> matchingBooks =
//                        session.createQuery("select b from Book b where b.title like :titleSearchPattern", Book.class)
//                                .setParameter("titleSearchPattern", "%Hibernate%")
//                                .getResultList();

                //Criteria queries
//                String titlePattern = "%Hibernate%";
//                String authorNamePattern = "%Ali%";
//
//                HibernateCriteriaBuilder criteriaBuilder = sessionFactory.getCriteriaBuilder();
//                CriteriaQuery<Book> query = criteriaBuilder.createQuery(Book.class);
//                Root<Book> book = query.from(Book.class);
//                Predicate where = criteriaBuilder.conjunction();
//
//                if (titlePattern != null) {
//                    where = criteriaBuilder.and(where, criteriaBuilder.like(book.get(Book_.title), titlePattern));
//                }
//                if (authorNamePattern != null) {
//                    where = criteriaBuilder.and(where, criteriaBuilder.like(book.get(Book_.AUTHOR).get(Author_.PERSON).get(Person_.NAME).get("firstName"), authorNamePattern));
//                }
//                CriteriaQuery<Book> bookCriteriaQuery = query.select(book)
//                        .where(where)
//                        .orderBy(criteriaBuilder.asc(book.get(Book_.TITLE)));
//                session.createSelectionQuery(bookCriteriaQuery)
//                        .getResultList()
//                        .forEach(System.out::println);

//                //native
//                List<Book> book =
//                        session.createNativeQuery("select * from book where title = ?1", Book.class)
//                                .setParameter(1, "Hibernate")
//                                .getResultList();

//                //pagination
//                List<Book> books = session.createQuery("from Book", Book.class)
//                        .setPage(Page.page(2, 1))
//                        .setOrder(Order.asc(Book_.title))
//                        .getResultList();
//                System.out.println(books);
            });
        }
    }
}