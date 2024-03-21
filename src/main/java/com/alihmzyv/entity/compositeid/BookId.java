package com.alihmzyv.entity.compositeid;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
public class BookId implements Serializable {
    @Serial
    private static final long serialVersionUID = -7179881824028655867L;

    String isbn;
    int printing;
}
