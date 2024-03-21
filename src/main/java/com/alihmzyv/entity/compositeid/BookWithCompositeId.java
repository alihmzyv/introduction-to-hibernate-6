package com.alihmzyv.entity.compositeid;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class BookWithCompositeId {
    @EmbeddedId
    BookId bookId;
}
