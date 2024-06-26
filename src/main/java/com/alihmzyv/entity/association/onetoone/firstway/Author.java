package com.alihmzyv.entity.association.onetoone.firstway;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import com.alihmzyv.entity.proxy.Person;
import com.alihmzyv.hellohibernate.entity.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author extends RootIdentifiableEntity {
    String village;

    @OneToOne(optional = false, fetch = LAZY)
    Person person;

    @OneToMany(mappedBy = "author")
    Set<Book> books;
}
