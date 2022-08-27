package com.example.layer.model;

import static org.valid4j.Validation.validate;

import com.example.layer.domain.order.core.OrderItems;
import com.example.layer.mapper.OrderMapper;
import java.util.List;
import lombok.Value;

@Value(staticConstructor = "of")
public class CreateOrderCommand {
    String address;
    List<OrderItemModel> orderItemModels;

    public OrderItems getOrderItemModels() {
        validate(orderItemModels != null, IllegalArgumentException.class);

        return OrderMapper.map(orderItemModels);
    }
}
