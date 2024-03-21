package com.alihmzyv.entity.association.onetoone.firstway;

import com.alihmzyv.entity.embeddable.Name;
import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Person extends RootIdentifiableEntity {
    Name name;

    @OneToOne(optional = false, mappedBy = Author_.PERSON, fetch = FetchType.LAZY)
    Author author;
}
