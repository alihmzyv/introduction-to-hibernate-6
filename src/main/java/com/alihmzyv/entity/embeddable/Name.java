package com.alihmzyv.entity.embeddable;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    @Basic(optional = false)
    String firstName;

    @Basic(optional = false)
    String lastName;

    String middleName;
}
