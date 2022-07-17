package com.wonit.order;


public interface OrderRepository {
    Order save(Order order);
    Order findBy(OrderId id);
}
