package com.github.dhslrl321.subscription;

import lombok.Value;

@Value(staticConstructor = "of")
public class ReservedBill {
    ReservedAt reservedAt;
    BillInterval interval;

    public ReservedBill reserve() {
        ReservedAt nextReservedAt = reservedAt.next(interval);
        return ReservedBill.of(nextReservedAt, this.interval);
    }
}
