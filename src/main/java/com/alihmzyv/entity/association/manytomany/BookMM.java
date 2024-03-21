package com.alihmzyv.entity.association.manytomany;

import com.alihmzyv.entity.mappedsuperclass.RootIdentifiableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
public class BookMM extends RootIdentifiableEntity {
    @ManyToMany(mappedBy = AuthorMM_.BOOKS)
    Set<AuthorMM> authors;
}
