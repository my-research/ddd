package com.example.layer.model.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderRequest {
    private String address;
    private List<OrderItemRequest> orderItems;
}
