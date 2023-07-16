package com.wonit.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderMembershipFixtureServiceTest {

    @Autowired
    OrderMembershipFixtureService sut;

    @Test
    void name() {
        sut.initializeFixture();
    }
}