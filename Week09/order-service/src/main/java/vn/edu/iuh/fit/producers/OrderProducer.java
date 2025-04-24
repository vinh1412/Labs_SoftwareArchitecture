/*
 * @ {#} OrderProducer.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.producers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.entities.Order;
import vn.edu.iuh.fit.entities.OrderItem;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Component
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderToPayment(String orderId, String customerId,double amount) {
        String message = orderId + ":" + customerId + ":" + amount;
        kafkaTemplate.send("order-payment", message);
        System.out.println("Sent to Kafka: " + message);
    }

    public void sendOrderToInventory(Order order) {
        for (OrderItem item : order.getItems()) {
            String message = item.getProductId() + ":" + item.getQuantity();
            kafkaTemplate.send("order-inventory", message);
        }
    }
}
