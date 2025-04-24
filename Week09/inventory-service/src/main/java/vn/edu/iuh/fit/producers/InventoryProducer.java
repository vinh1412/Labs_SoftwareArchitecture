/*
 * @ {#} InventoryProducer.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.producers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Component
@RequiredArgsConstructor
public class InventoryProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendInventoryToProduct(String productId, int stock) {
        String message = productId + ":" + stock;
        kafkaTemplate.send("inventory-product", message);
        System.out.println("Sent to Kafka: " + message);
    }
}
