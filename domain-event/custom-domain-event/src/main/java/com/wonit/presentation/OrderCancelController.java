package com.wonit.presentation;

import com.wonit.application.OrderCancelService;
import com.wonit.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apis")
@RequiredArgsConstructor
public class OrderCancelController {

    private final OrderCancelService orderCancelService;

    @DeleteMapping("/orders/{id}")
    public ResponseEntity<Order> cancel(@PathVariable Long id) {
        orderCancelService.cancelBy(id);
        return ResponseEntity.ok(null);
    }
}
