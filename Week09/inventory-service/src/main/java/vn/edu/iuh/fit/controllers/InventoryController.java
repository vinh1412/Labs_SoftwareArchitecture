/*
 * @ {#} InventoryController.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.entities.Inventory;
import vn.edu.iuh.fit.services.InventoryService;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */
@RestController
@RequestMapping("/inventories")
@RequiredArgsConstructor
public class InventoryController {
     private final InventoryService inventoryService;

     @PostMapping
     public ResponseEntity<?> create(@RequestBody Inventory inventory) {
         Inventory createdInventory = inventoryService.create(inventory);
         return ResponseEntity.ok(createdInventory);
     }
}
