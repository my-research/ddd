package com.wonit.controller;

import com.wonit.order.Order;
import com.wonit.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("/orders")
    public ResponseEntity<Order> order() {
        return ResponseEntity.ok(service.order());
    }

}
