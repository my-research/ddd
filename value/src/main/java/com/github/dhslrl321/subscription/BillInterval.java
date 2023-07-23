package com.github.dhslrl321.subscription;

import lombok.Value;

@Value(staticConstructor = "of")
public class BillInterval {
    long value;
    IntervalUnit unit;
}
