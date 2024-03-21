package com.alihmzyv.entity.test;

import com.alihmzyv.entity.embeddable.Name;
import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Person extends RootIdentifiableEntity {
    Name name;
}
