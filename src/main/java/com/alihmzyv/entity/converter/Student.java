package com.alihmzyv.entity.converter;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Student extends RootIdentifiableEntity {
    @Convert(converter = DateTimeConverter.class)
    Long registeredAt;
}
