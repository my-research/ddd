package com.example.layer.mapper;

import com.example.layer.domain.order.core.OrderItem;
import com.example.layer.domain.order.core.OrderItems;
import com.example.layer.model.OrderItemModel;
import java.util.List;
import java.util.stream.Collectors;

public class OrderMapper {
    public static OrderItems map(List<OrderItemModel> orderItemModels) {
        List<OrderItem> items = orderItemModels.stream().map(i -> OrderItem.of(i.getProductId(), i.getQuantity()))
                .collect(Collectors.toList());
        return OrderItems.of(items);
    }
}
