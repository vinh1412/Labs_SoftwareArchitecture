/*
 * @ {#} InventoryServiceImpl.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Inventory;
import vn.edu.iuh.fit.repositories.InventoryRepository;
import vn.edu.iuh.fit.services.InventoryService;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Override
    public Inventory create(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public Inventory updateInventory(String productId, int quantity) {
        Inventory inventory = inventoryRepository.findByProductId(productId);
        if (inventory == null) {
            throw new RuntimeException("Product not found");
        }
        inventory.setQuantity(inventory.getQuantity() - quantity);
        return inventoryRepository.save(inventory);
    }
}
