package com.example.layer.model;

import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
@ToString
public class UpdatedUser {
    Long userId;
    String address;
}

