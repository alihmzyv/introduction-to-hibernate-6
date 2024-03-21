package com.alihmzyv.entity.objectrelationalmapping.singletable;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Pen extends Product {
    BigDecimal length;
}
