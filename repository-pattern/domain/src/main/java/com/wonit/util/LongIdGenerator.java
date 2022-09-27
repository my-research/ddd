package com.wonit.util;

import java.time.ZonedDateTime;

public class LongIdGenerator {
    public static Long gen() {
        return ZonedDateTime.now().toEpochSecond();
    }
}
