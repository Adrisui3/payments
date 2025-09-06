package com.manager.payments.adapter.out.persistence.players;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PlayerJpaRepository extends JpaRepository<PlayerJpaEntity, UUID> {
    Optional<PlayerJpaEntity> findByPersonalId(String personalId);
}
