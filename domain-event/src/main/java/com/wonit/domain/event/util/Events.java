package com.wonit.domain.event.util;

import com.wonit.domain.event.DomainEvent;
import org.springframework.context.ApplicationEventPublisher;

public class Events {
    private static ApplicationEventPublisher publisher;

    protected static void setPublisher(ApplicationEventPublisher publisher) {
        Events.publisher = publisher;
    }

    public static void raise(DomainEvent event) {
        if (publisher == null) {
            throw new IllegalStateException();
        }
        publisher.publishEvent(event);
    }
}
