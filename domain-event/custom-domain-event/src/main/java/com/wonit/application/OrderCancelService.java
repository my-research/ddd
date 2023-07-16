package com.wonit.application;

import com.wonit.domain.Order;
import com.wonit.infrastructure.OrderRepository;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderCancelService {

    private final OrderRepository repository;

    public void cancelBy(Long orderId) {
        Order order = repository.findById(orderId).orElseThrow(NoSuchElementException::new);
        order.cancel();
        repository.save(order);
    }
}
