package com.wonit.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
    public void sendSmsTo(String phoneNumber) {
        log.info("SMS was sent to {} !!", phoneNumber);
    }
}
