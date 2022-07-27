package org.example.entity;

import lombok.Value;

@Value(staticConstructor = "of")
public class Info {
    int seq;
    String name;
}
