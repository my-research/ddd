package com.example.layer.service;

import static org.valid4j.Validation.validate;

import com.example.layer.domain.order.core.Order;
import com.example.layer.domain.order.repository.OrderRepository;
import com.example.layer.model.CreateOrderCommand;
import java.util.logging.Logger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateOrderService {

    /**
     * Q. 얘는 도메인 서비스인가 애플리케이션 서비스인가
     * A1. 도메인 서비스일 것이다.
     * A2. 애플리케이션 서비스일 것이다.
     */

    private final OrderRepository repository;

    public void create(CreateOrderCommand command) {
        validate(command.getAddress() != null, IllegalArgumentException.class);
        validate(command.getOrderItemModels().size() != 0, IllegalArgumentException.class);

        Order order = Order.newInstance(command.getAddress(), command.getOrderItemModels());
        Order save = repository.save(order);
        log.info("order created!! => {}", save);
    }
}
