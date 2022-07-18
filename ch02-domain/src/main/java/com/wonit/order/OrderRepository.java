package com.wonit.order;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findAll();
}
