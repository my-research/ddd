package com.example.layer.application;

import com.example.layer.core.Order;
import com.example.layer.model.SavedOrder;
import com.example.layer.core.OrderRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderSaver {

    private final OrderRepository repository;

    public SavedOrder save() {
        Order order = Order.builder().address(UUID.randomUUID().toString()).build();
        Order saved = repository.save(order);
        return SavedOrder.of(saved.getId(), saved.getAddress());
    }
}
