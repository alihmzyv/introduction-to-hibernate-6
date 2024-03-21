package com.alihmzyv.entity.proxy;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Author extends RootIdentifiableEntity {
    String village;

    @OneToOne(optional = false, fetch = LAZY)
    Person person;

    @OneToMany(mappedBy = "author")
    Set<Book> books;
}
