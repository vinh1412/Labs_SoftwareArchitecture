/*
 * @ {#} PaymentConsumer.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.consumers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.services.PaymentService;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Component
@RequiredArgsConstructor
public class PaymentConsumer {

    private final PaymentService paymentService;

    @KafkaListener(topics = "order-payment", groupId = "payment-group")
    public void listen(String message) {
        // Message là JSON hoặc String đơn giản như: "orderId:customerId:amount"
        System.out.println("Nhận message từ Kafka: " + message);

        try {
            String[] parts = message.split(":");
            String orderId = parts[0];
            String customerId = parts[1];
            double amount = Double.parseDouble(parts[2]);

            paymentService.processPayment(orderId, customerId, amount);
        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý message Kafka: " + e.getMessage());
        }
    }
}
