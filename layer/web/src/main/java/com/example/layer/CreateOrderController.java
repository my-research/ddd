package com.example.layer;

import com.example.layer.model.CreateOrderCommand;
import com.example.layer.model.OrderItemModel;
import com.example.layer.model.request.CreateOrderRequest;
import com.example.layer.model.request.OrderItemRequest;
import com.example.layer.model.response.Result;
import com.example.layer.service.CreateOrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public final class CreateOrderController {

    private final CreateOrderService service;

    @PostMapping
    public ResponseEntity<Result> create(@RequestBody CreateOrderRequest body) {
        service.create(CreateOrderCommand.of(body.getAddress(), convert(body.getOrderItems())));
        return ResponseEntity.ok(new Result("주문이 완료되었습니다."));
    }

    private List<OrderItemModel> convert(List<OrderItemRequest> items) {
        return items.stream().map(item -> OrderItemModel.of(item.getProductId(), item.getQuantity()))
                .collect(Collectors.toList());
    }
}
