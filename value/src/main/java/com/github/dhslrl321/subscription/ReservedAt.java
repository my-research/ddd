package com.github.dhslrl321.subscription;

import lombok.Value;

import java.time.LocalDateTime;

import static com.github.dhslrl321.subscription.IntervalUnit.MONTH;

@Value(staticConstructor = "of")
public class ReservedAt {
    LocalDateTime value;

    public ReservedAt next(BillInterval interval) {
        if (MONTH.equals(interval.getUnit())) {
            return ReservedAt.of(value.plusMonths(interval.getValue()));
        }

        throw new UnsupportedOperationException();
    }
}
