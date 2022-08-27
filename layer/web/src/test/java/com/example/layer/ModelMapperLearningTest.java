package com.example.layer;

import com.example.layer.domain.order.core.OrderItem;
import com.example.layer.model.OrderItemModel;
import com.example.layer.model.request.OrderItemRequest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

class ModelMapperLearningTest {

    @Test
    void name() {
        ModelMapper mapper = new ModelMapper();
        List<OrderItemRequest> items = List.of(new OrderItemRequest(1L, 2), new OrderItemRequest(2L, 1));
        mapper.map(items, List.class);

    }
}