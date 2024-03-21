package com.alihmzyv.entity.proxy;

import com.alihmzyv.entity.association.onetomany.Publisher;
import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import static jakarta.persistence.FetchType.LAZY;


@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Book extends RootIdentifiableEntity {
    String title;

    @ManyToOne(fetch = LAZY)
    Author author;
}
