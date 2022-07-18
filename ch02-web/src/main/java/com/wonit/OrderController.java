package com.wonit;

import com.wonit.order.Order;
import com.wonit.order.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final JpaOrderRepository repository;

    private final String[] locations = {"seoul", "yeosu", "busan", "katar", "tokyo", "sydney", "liverpool"};
    private long i = 0;

    @GetMapping("/")
    public ResponseEntity<List<Order>> getOrder() {
        if (i >= locations.length) {
            i = 0;
        }
        Order order = new Order(i, locations[(int)i]);
        repository.save(order);
        i++;
        return ResponseEntity.ok(repository.findAll());
    }
}
