/*
 * @ {#} InventoryConsumer.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.consumsers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.entities.Inventory;
import vn.edu.iuh.fit.producers.InventoryProducer;
import vn.edu.iuh.fit.services.InventoryService;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Component
@RequiredArgsConstructor
public class InventoryConsumer {
    private final InventoryService inventoryService;
    private final InventoryProducer inventoryProducer;

    @KafkaListener(topics = "order-inventory", groupId = "inventory-group")
    public void listen(String message) {
        // Message là JSON hoặc String đơn giản như: "productId:quantity"
        System.out.println("Nhận message từ Kafka: " + message);

        try {
            String[] parts = message.split(":");

            if (parts.length != 2) {
                throw new IllegalArgumentException("Message không đúng định dạng: productId:quantity");
            }

            String productId = parts[0];
            String quantity = parts[1];

            Inventory inventory=  inventoryService.updateInventory(productId, Integer.parseInt(quantity));

            // Gửi thông tin về sản phẩm đã được cập nhật đến một topic khác
            inventoryProducer.sendInventoryToProduct(inventory.getProductId(), inventory.getQuantity());
        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý message Kafka: " + e.getMessage());
        }
    }
}
