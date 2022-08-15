package com.wonit.application;

import com.wonit.domain.Membership;
import com.wonit.domain.Order;
import com.wonit.infrastructure.MembershipRepository;
import com.wonit.infrastructure.OrderRepository;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderMembershipFixtureService {

    private final OrderRepository orderRepository;
    private final MembershipRepository membershipRepository;

    @Transactional
    public void initializeFixture() {
        IntStream.range(0, 3).forEach(i -> {
            Order order = Order.create();
            Order saved = orderRepository.save(order);

            Membership membership = Membership.by(saved.getId(), "010-1234-123" + i);
            membershipRepository.save(membership);
        });
    }
}
