package com.wonit.event;

import static org.assertj.core.api.Assertions.assertThat;

import com.wonit.domain.event.OrderCanceled;
import org.junit.jupiter.api.Test;

class OrderCanceledTest {

    OrderCanceled sut;

    @Test
    void name() {
        OrderCanceled event = OrderCanceled.of(1L);
        assertThat(event.getTimestamp()).isNotNull();
    }
}