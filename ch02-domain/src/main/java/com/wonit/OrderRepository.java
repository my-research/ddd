package com.wonit;

import lombok.Value;


public interface OrderRepository {
    Order save(Order order);
    Order findById(OrderId id);
    Order findByIdDESC(OrderId id);
}
