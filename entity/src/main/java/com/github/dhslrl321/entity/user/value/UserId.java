package com.github.dhslrl321.entity.user.value;

import lombok.Value;

@Value(staticConstructor = "of")
public class UserId {
    long value;
}
