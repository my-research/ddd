package com.example.ch01jpa.persistence.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.ch01jpa.domain.core.order.Order;
import com.example.ch01jpa.domain.core.order.Receiver;
import com.example.ch01jpa.domain.value.Address;
import com.example.ch01jpa.domain.value.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class OrderRepositoryTest {
    public static final String ANY_NAME = "jang";
    public static final Address ANY_ADDRESS = Address.from("seoul");
    public static final PhoneNumber ANY_PHONE_NUMBER = PhoneNumber.from("01012341234");
    public static final Receiver RECEIVER = Receiver.of(ANY_NAME, ANY_ADDRESS, ANY_PHONE_NUMBER);

    @Autowired
    OrderRepository sut;

    @Test
    void saveAndQuery() {
        Order order = Order.builder()
                .receiver(RECEIVER)
                .build();

        Order saved = sut.save(order);
        Order found = sut.findById(saved.getId()).orElseThrow(IllegalArgumentException::new);

        assertThat(saved).isEqualTo(found);
    }
}