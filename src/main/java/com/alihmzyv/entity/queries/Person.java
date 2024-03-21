package com.alihmzyv.entity.queries;

import com.alihmzyv.entity.embeddable.Name;
import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Person extends RootIdentifiableEntity {
    Name name;
}
