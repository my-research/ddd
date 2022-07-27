package org.example.entity;

import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
@ToString
public class Info {
    Integer seq;
    String name;
}
