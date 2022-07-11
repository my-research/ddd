package com.example.ch01jpa.domain.converter;

import com.example.ch01jpa.domain.core.order.Receiver;
import javax.persistence.AttributeConverter;

public class ReceiverConverter implements AttributeConverter<Receiver, String> {
    @Override
    public String convertToDatabaseColumn(Receiver attribute) {
        return null;
    }

    @Override
    public Receiver convertToEntityAttribute(String dbData) {
        return null;
    }
}
