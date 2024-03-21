package com.alihmzyv.entity.association.onetoone.firstway;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author extends RootIdentifiableEntity {
    @OneToOne(optional = false, fetch = LAZY)
    Person person;
}
