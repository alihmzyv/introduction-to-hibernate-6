package com.alihmzyv.entity.mappedsuperclass;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class RootIdentifiableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
}
