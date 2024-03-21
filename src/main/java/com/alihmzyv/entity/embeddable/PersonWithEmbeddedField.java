package com.alihmzyv.entity.embeddable;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class PersonWithEmbeddedField extends RootIdentifiableEntity {
    Name name;
    String fatherName;
}
