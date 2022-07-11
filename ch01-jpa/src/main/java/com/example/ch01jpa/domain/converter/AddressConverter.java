package com.example.ch01jpa.domain.converter;

import com.example.ch01jpa.domain.value.Address;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class AddressConverter implements AttributeConverter<Address, String> {
    @Override
    public String convertToDatabaseColumn(Address attribute) {
        return attribute.getValue();
    }

    @Override
    public Address convertToEntityAttribute(String dbData) {
        return Address.from(dbData);
    }
}
