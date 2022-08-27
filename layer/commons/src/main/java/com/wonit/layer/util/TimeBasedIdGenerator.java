package com.wonit.layer.util;

import java.time.ZonedDateTime;

public class TimeBasedIdGenerator {
    public static Long gen() {
        return ZonedDateTime.now().toEpochSecond();
    }
}
