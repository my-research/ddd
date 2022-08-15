package com.wonit.domain;

import static com.wonit.domain.OrderStatus.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void name() {
        Order order = Order.create();
        assertThat(order.getId()).isNotNull();
    }

    @Test
    void name2() {
        Order order = Order.create();
        assertThat(order.getStatus()).isEqualTo(CREATED);

        order.cancel();
        assertThat(order.getStatus()).isEqualTo(CANCELED);
    }
}