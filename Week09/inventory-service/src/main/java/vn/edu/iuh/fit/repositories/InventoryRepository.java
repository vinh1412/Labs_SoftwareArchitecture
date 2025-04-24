/*
 * @ {#} InventoryRepository.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.edu.iuh.fit.entities.Inventory;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
public interface InventoryRepository extends MongoRepository<Inventory, String> {
    Inventory findByProductId(String productId);
}
