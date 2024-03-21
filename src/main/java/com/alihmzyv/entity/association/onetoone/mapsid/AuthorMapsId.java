package com.alihmzyv.entity.association.onetoone.mapsid;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class AuthorMapsId extends RootIdentifiableEntity {
    @Id
    Long id;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @MapsId
    PersonMapsId person;
}
