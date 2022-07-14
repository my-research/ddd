package com.example.ch01jpa.controller;

import com.example.ch01jpa.domain.core.goods.Goods;
import com.example.ch01jpa.persistence.repository.GoodsRepository;
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
