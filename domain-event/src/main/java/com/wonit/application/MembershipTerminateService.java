package com.wonit.application;

import com.wonit.domain.Membership;
import com.wonit.domain.event.OrderCanceled;
import com.wonit.infrastructure.MembershipRepository;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MembershipTerminateService {

    private final MembershipRepository repository;

    public void terminateBy(Long orderId) {
        Membership found = repository.findByOrderId(orderId).orElseThrow(NoSuchElementException::new);
        found.terminate();
        repository.save(found);
    }
}
