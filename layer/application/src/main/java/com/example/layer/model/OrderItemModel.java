package com.example.layer.model;

import lombok.Value;

@Value(staticConstructor = "of")
public class OrderItemModel {
    Long productId;
    int quantity;
}
