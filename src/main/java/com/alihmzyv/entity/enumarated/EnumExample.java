package com.alihmzyv.entity.enumarated;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.DayOfWeek;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class EnumExample extends RootIdentifiableEntity {
    @Enumerated
    DayOfWeek dayOfWeek;
}
