package com.example.ch01jpa.controller;

import com.example.ch01jpa.domain.core.goods.Goods;
import com.example.ch01jpa.domain.core.order.Order;
import com.example.ch01jpa.domain.core.order.Receiver;
import com.example.ch01jpa.domain.value.Address;
import com.example.ch01jpa.domain.value.Location;
import com.example.ch01jpa.domain.value.Manufacturer;
import com.example.ch01jpa.domain.value.Origin;
import com.example.ch01jpa.domain.value.PhoneNumber;
import com.example.ch01jpa.persistence.repository.GoodsRepository;
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
public class GoodsController {

    private final GoodsRepository repository;

    @GetMapping("/goods")
    public ResponseEntity<Goods> getOrders() {
        Goods save = repository.save(
                Goods.builder().manufacturer(Manufacturer.of(Origin.of("origin"), Location.of("location"))).build());
        return ResponseEntity.ok(save);
    }
}
