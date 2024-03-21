package com.alihmzyv.entity.embeddable;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Embeddable
public class Name {
    @Basic(optional = false)
    String firstName;

    @Basic(optional = false)
    String lastName;

    String middleName;
}
