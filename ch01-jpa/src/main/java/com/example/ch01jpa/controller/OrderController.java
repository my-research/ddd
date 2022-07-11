package com.example.ch01jpa.controller;

import com.example.ch01jpa.domain.core.order.Order;
import com.example.ch01jpa.domain.core.order.Receiver;
import com.example.ch01jpa.domain.value.Address;
import com.example.ch01jpa.domain.value.PhoneNumber;
import com.example.ch01jpa.persistence.repository.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository repository;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders() {
        Receiver receiver = Receiver.of("jang", Address.from("seoul"), PhoneNumber.from("01012341234"));
        Order order = Order.builder()
                .build();
        repository.save(order);
        return ResponseEntity.ok(repository.findAll());
    }
}
