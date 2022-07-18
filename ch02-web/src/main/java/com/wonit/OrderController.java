package com.wonit;

import com.wonit.order.core.Order;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final JpaOrderRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<Order>> getOrder() {
        return ResponseEntity.ok(repository.findAll());
    }
}
