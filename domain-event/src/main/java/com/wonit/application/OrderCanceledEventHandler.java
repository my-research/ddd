package com.wonit.application;

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

    @EventListener(OrderCanceled.class)
    public void handle(OrderCanceled event) {
        log.info("OrderCanceledEvent occurred !! => {}", event);
        membershipTerminateService.terminateBy(event.getOrderId());
    }
}
