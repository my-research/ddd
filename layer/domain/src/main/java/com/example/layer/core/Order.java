package com.example.layer.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Order {
    private Long id;
    private String address;

    public void decorateAddress() {
        address = "주소는 [" + address + "] 입니다.";
    }
}
