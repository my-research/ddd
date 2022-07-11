package com.example.ch01jpa.domain.value;

import lombok.Value;

@Value(staticConstructor = "from")
public class PhoneNumber {
    String value;
}
