/*
 * @ {#} InventoryService.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.entities.Inventory;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
public interface InventoryService {
    Inventory create(Inventory inventory);
    Inventory updateInventory(String productId, int quantity);
}
