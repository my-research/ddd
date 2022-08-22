package com.example.layer.application;

import com.example.layer.core.Order;
import com.example.layer.model.UpdatedUser;
import com.example.layer.core.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderUpdater {
    private final OrderRepository repository;

    @Transactional
    public UpdatedUser update(Long userId) {
        Order order = repository.findById(userId).orElseThrow();
        order.printAddress();
        Order saved = repository.save(order);
        return UpdatedUser.of(saved.getId(), saved.getAddress());
    }
}
