package com.alihmzyv.entity.queries;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Locale;

import static jakarta.persistence.FetchType.LAZY;


@ToString(exclude = "author")
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
