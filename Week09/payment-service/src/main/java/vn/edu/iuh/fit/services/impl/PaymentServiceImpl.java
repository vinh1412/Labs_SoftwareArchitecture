/*
 * @ {#} PaymentServiceImpl.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Payment;
import vn.edu.iuh.fit.enums.PaymentMethod;
import vn.edu.iuh.fit.enums.PaymentStatus;
import vn.edu.iuh.fit.repositories.PaymentRepository;
import vn.edu.iuh.fit.services.PaymentService;

import java.time.LocalDateTime;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Payment processPayment(String orderId, String customerId ,double amount) {
        Payment payment = Payment.builder()
                .orderId(orderId)
                .customerId(customerId)
                .amount(amount)
                .status(PaymentStatus.SUCCESS)
                .paymentMethod(PaymentMethod.CREDIT_CARD)
                .createdAt(LocalDateTime.now())
                .build();

        return paymentRepository.save(payment);
    }
}
