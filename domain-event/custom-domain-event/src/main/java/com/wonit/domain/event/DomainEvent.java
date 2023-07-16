package com.wonit.domain.event;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public abstract class DomainEvent {
    private final LocalDateTime timestamp = LocalDateTime.now();
}
