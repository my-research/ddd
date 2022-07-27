package org.example.entity;

import lombok.Value;

@Value(staticConstructor = "of")
public class Info {
    String info;
}
