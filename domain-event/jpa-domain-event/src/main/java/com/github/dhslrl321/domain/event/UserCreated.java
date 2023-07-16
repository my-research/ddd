package com.github.dhslrl321.domain.event;

import com.github.dhslrl321.domain.User;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@ToString
public class UserCreated extends ApplicationEvent {

    private final User user;

    public UserCreated(Object source) {
        super(source);
        this.user = (User) source;
    }
}
