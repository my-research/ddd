package com.github.dhslrl321.price;

import lombok.Value;

/**
 * 개념적 하나
 */
@Value(staticConstructor = "of")
public class Money {
    long value;
    Currency currency;
}
