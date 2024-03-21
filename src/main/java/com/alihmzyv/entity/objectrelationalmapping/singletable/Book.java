package com.alihmzyv.entity.objectrelationalmapping.singletable;

import jakarta.persistence.Entity;
import jakarta.persistence.SecondaryTable;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@SecondaryTable(name="Editions")
public class Book extends Product {
    String name;
}
