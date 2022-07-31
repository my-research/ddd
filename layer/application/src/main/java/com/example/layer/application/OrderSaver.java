package com.example.layer.application;

import com.example.layer.core.Order;
import com.example.layer.model.SavedUser;
import com.example.layer.repository.OrderRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderSaver {

    private final OrderRepository repository;

    public SavedUser save() {
        Order order = Order.builder().address(UUID.randomUUID().toString()).build();
        Order saved = repository.save(order);
        return SavedUser.of(saved.getId(), saved.getAddress());
    }
}
