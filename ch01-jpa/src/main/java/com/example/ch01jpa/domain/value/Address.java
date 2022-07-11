package com.example.ch01jpa.domain.value;

import lombok.NoArgsConstructor;
import lombok.Value;

@Value(staticConstructor = "from")
public class Address {
    String value;
}
