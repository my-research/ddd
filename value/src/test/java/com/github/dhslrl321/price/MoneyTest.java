package com.github.dhslrl321.price;

import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void name() {
        Money money = Money.of(100, Currency.DOLLAR);
    }
}
