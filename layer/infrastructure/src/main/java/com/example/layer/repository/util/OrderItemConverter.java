package com.example.layer.repository.util;

import com.example.layer.repository.SpringDataJpaOrderItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class OrderItemConverter implements AttributeConverter<List<SpringDataJpaOrderItem>, String> {

    private final Gson gson = new Gson();

    @Override
    public String convertToDatabaseColumn(List<SpringDataJpaOrderItem> attribute) {
        return gson.toJson(attribute);
    }

    @Override
    public List<SpringDataJpaOrderItem> convertToEntityAttribute(String dbData) {
        return gson.fromJson(dbData, new TypeToken<List<SpringDataJpaOrderItem>>(){}.getType());
    }
}
