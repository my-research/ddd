package com.example.layer.model;

import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
@ToString
public class SavedOrder {
    Long userId;
    String address;
}
