/*
 * @ {#} OrderController.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entities.Order;
import vn.edu.iuh.fit.producers.OrderProducer;
import vn.edu.iuh.fit.services.OrderService;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {
    private final OrderService orderService;
    private final OrderProducer orderProducer;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Order order) {
        Order createdOrder = orderService.create(order);
        orderProducer.sendOrderToInventory(order);
        orderProducer.sendOrderToPayment(order.getId(), order.getCustomerId() ,order.getTotalAmount());
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable String id) {
        return orderService.getById(id);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable String id, @RequestBody Order order) {
        return orderService.update(id, order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        orderService.delete(id);
    }
}
