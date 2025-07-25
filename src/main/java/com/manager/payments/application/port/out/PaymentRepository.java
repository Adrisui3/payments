package com.manager.payments.application.port.out;

import com.manager.payments.model.payments.Payment;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findById(UUID id);

}
