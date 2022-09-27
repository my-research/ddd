package com.wonit.service;

import com.wonit.order.Order;
import com.wonit.order.OrderRepository;
import com.wonit.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public Order order() {
        Order order = Order.create(123L);

        order.add(Product.of(1L, "notebook", 3_250_000L));
        order.add(Product.of(12L, "desk", 550_000L));
        order.add(Product.of(912L, "phone", 2_550_000L));

        Order save = repository.save(order);

        Order found = repository.findByUserId(123L).get();
        assert save.getUserId().equals(found.getUserId());
        return found;
    }
}
