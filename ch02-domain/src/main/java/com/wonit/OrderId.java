package com.wonit;

import lombok.Getter;
import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
public class OrderId {
    Long value;


}
