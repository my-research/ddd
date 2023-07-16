package com.github.dhslrl321.create;

import com.github.dhslrl321.domain.event.UserCreated;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserCreatedEventListener implements ApplicationListener<UserCreated> {

    @Override
    public void onApplicationEvent(UserCreated event) {
        log.info(event.toString());
    }
}
