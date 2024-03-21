package com.alihmzyv.entity.embeddable;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Name {
    @Basic(optional = false)
    String firstName;

    @Basic(optional = false)
    String lastName;

    String middleName;
}
