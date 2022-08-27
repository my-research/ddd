package com.wonit.layer.util;

import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class TimeBasedIdGeneratorTest {

    @Test
    void name() {
        System.out.println(ZonedDateTime.now().toEpochSecond());
    }
}