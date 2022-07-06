package com.example.ch01jpa.controller;

import com.example.ch01jpa.domain.Order;
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
        repository.save(Order.builder().address("seoul").build());
        return ResponseEntity.ok(repository.findAll());
    }
}
