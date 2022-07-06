package com.example.ch01jpa.domain;

import org.junit.jupiter.api.Test;

class OrderTest {

   Order sut;

    @Test
    void name() {
        sut = Order.of("seoul", null);

        String address = sut.getAddress();
        System.out.println("address = " + address);
    }
}