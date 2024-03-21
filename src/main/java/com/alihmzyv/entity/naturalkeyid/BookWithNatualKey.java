package com.alihmzyv.entity.naturalkeyid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class BookWithNatualKey {
    @Id
    String isbn;
}
