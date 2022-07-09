package com.example.ch01jpa.domain;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrderTest {

    @InjectMocks
    Order sut;

    @Mock
    EventFactory eventFactory;
    @Mock
    OrderReceived orderReceived;

    @Test
    void name() {
        sut = Order.of("seoul", null, eventFactory);

        // given(eventFactory.orderReceivedNonStatic(sut)).willReturn(orderReceived);

        String address = sut.getAddress();
        System.out.println("address = " + address);
    }
}