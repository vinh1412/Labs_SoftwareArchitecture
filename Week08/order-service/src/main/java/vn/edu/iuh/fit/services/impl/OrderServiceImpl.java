/*
 * @ {#} OrderServiceImpl.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Order;
import vn.edu.iuh.fit.repositories.OrderRepository;
import vn.edu.iuh.fit.services.OrderService;

import java.time.LocalDateTime;
import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
        order.setTotalAmount(order.calculatedTotalAmount());
        order.setCreatedAt(LocalDateTime.now());
        order.setStatus("PENDING");
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order update(String id, Order order) {
        Order existing = orderRepository.findById(id).orElse(null);
        if (existing == null) return null;
        order.setId(id);
        return orderRepository.save(order);
    }

    @Override
    public void delete(String id) {
        Order existing = orderRepository.findById(id).orElse(null);
        if (existing != null) {
            orderRepository.delete(existing);
        }
    }
}
