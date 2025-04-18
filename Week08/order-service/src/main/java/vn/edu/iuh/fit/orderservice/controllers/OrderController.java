/**
 * @ (#) OrderController.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.orderservice.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.orderservice.entities.Order;
import vn.edu.iuh.fit.orderservice.serivces.OrderService;


import java.util.Arrays;
import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        List<Order> orders = orderService.findAll();
        System.out.println("Orders: " + orders.size());
        for (Order order : orders) {
            System.out.println("Order: " + order);
        }
        return orders;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        Order order = orderService.findById(id);
        if(order == null) {
            return null;
        }
        System.out.println("Order: " + order);
        return order;
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.save(order);
        return createdOrder;
    }

    @PutMapping("/update/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        Order updatedOrder = orderService.save(order);
        return updatedOrder;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }


}
