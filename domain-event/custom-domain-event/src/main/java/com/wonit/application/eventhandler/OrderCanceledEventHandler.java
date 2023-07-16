package com.wonit.application.eventhandler;

import com.wonit.application.MembershipTerminateService;
import com.wonit.application.NotificationService;
import com.wonit.domain.Membership;
import com.wonit.domain.event.OrderCanceled;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderCanceledEventHandler {
    private final MembershipTerminateService membershipTerminateService;
    private final NotificationService notificationService;

    @EventListener(OrderCanceled.class)
    public void handle(OrderCanceled event) {
        log.info("OrderCanceledEvent occurred !! => {}", event);
        Membership terminated = membershipTerminateService.terminateBy(event.getOrderId());
        notificationService.sendSmsTo(terminated.getUserPhoneNumber());
    }
}
