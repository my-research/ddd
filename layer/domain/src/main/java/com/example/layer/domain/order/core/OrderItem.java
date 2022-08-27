package com.example.layer.domain.order.core;

import lombok.Value;

@Value(staticConstructor = "of")
public class OrderItem {
    Long productId;
    int quantity;
}
