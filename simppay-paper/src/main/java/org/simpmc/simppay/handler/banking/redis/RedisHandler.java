package org.simpmc.simppay.handler.banking.redis;

import org.simpmc.simppay.data.PaymentStatus;
import org.simpmc.simppay.handler.PaymentHandler;
import org.simpmc.simppay.model.Payment;
import org.simpmc.simppay.model.PaymentResult;
import org.simpmc.simppay.model.detail.PaymentDetail;

public class RedisHandler implements PaymentHandler {
    @Override
    public PaymentStatus processPayment(Payment payment) {
        return null;
    }

    @Override
    public PaymentResult getTransactionResult(PaymentDetail detail) {
        return null;
    }

    @Override
    public PaymentStatus cancel(Payment payment) {
        return null;
    }
}
