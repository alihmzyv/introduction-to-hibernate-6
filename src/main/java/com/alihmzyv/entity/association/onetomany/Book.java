package com.alihmzyv.entity.association.onetomany;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Book extends RootIdentifiableEntity {
    @ManyToOne(fetch = LAZY)
    Publisher publisher;
}
