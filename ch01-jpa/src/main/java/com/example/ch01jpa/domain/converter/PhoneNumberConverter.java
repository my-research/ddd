package com.example.ch01jpa.domain.converter;

import com.example.ch01jpa.domain.value.PhoneNumber;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PhoneNumberConverter implements AttributeConverter<PhoneNumber, String> {
    @Override
    public String convertToDatabaseColumn(PhoneNumber attribute) {
        return attribute.getValue();
    }

    @Override
    public PhoneNumber convertToEntityAttribute(String dbData) {
        return PhoneNumber.from(dbData);
    }
}
