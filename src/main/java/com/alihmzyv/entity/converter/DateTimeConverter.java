package com.alihmzyv.entity.converter;

import jakarta.persistence.AttributeConverter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class DateTimeConverter implements AttributeConverter<Long, LocalDateTime> {
    @Override
    public LocalDateTime convertToDatabaseColumn(Long attribute) {
        return Optional.ofNullable(attribute)
                .map(epochMillis -> Instant.ofEpochMilli(epochMillis).atOffset(ZoneOffset.UTC).toLocalDateTime())
                .orElse(null);
    }

    @Override
    public Long convertToEntityAttribute(LocalDateTime dbData) {
        return Optional.ofNullable(dbData)
                .map(dateTimeInUtc -> dateTimeInUtc.toInstant(ZoneOffset.UTC).toEpochMilli())
                .orElse(null);
    }
}
