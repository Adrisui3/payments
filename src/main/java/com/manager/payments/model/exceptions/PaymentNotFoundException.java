package com.manager.payments.model.exceptions;

import java.util.UUID;

public class PaymentNotFoundException extends RuntimeException {
    public PaymentNotFoundException(UUID id) {
        super("Payment not found with id: " + id);
    }
}
