package com.example.ch01jpa.domain.core.order;

import com.example.ch01jpa.domain.value.Address;
import com.example.ch01jpa.domain.value.PhoneNumber;
import javax.persistence.Embedded;
import lombok.Data;
import lombok.Value;

@Value(staticConstructor = "of")
public class Receiver {
    String name;
    Address address;
    PhoneNumber phoneNumber;
}
