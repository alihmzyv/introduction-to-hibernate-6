package com.alihmzyv.entity.test;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Author extends RootIdentifiableEntity {
    @OneToOne
    Person person;
}
