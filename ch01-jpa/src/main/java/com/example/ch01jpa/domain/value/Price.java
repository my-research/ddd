package com.example.ch01jpa.domain.value;

import lombok.Value;

@Value(staticConstructor = "of")
public class Price {
    long value;
}
