package com.wonit.product;

import lombok.Value;

@Value(staticConstructor = "of")
public class Product {
    Long id;
    String name;
    Long price;
}
