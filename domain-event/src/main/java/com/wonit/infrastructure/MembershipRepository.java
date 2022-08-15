package com.wonit.infrastructure;

import com.wonit.domain.Membership;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface MembershipRepository extends CrudRepository<Membership, Long> {
    Optional<Membership> findByOrderId(Long orderId);
}
