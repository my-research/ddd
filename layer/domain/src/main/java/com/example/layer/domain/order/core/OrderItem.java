package com.example.layer.domain.order.core;

import lombok.Value;

@Value
public class OrderItem {
    Long productId;
    int quantity;
}
