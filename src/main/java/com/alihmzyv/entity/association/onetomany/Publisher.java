package com.alihmzyv.entity.association.onetomany;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Publisher extends RootIdentifiableEntity {
    @OneToMany(mappedBy = Book_.PUBLISHER,  fetch = FetchType.EAGER)
    Set<Book> books;
}
