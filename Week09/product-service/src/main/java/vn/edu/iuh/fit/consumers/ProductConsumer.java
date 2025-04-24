/*
 * @ {#} ProductConsumer.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.consumers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.services.ProductService;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Component
@RequiredArgsConstructor
public class ProductConsumer {
    private final ProductService productService;

    @KafkaListener(topics = "inventory-product", groupId = "product-group")
    public void consumeProduct(String message) {
        String[] parts = message.split(":");
        System.out.println("Received message from Kafka: " + message);
        String productId = parts[0];
        int stock = Integer.parseInt(parts[1]);
        productService.updateStock(productId, stock);
    }
}
