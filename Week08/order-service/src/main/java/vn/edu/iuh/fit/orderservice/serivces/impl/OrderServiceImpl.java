/**
 * @ (#) OrderServiceImpl.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.orderservice.serivces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.entities.Order;
import vn.edu.iuh.fit.orderservice.repositories.OrderRepository;
import vn.edu.iuh.fit.orderservice.serivces.OrderService;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order save(Order order) {
        if (order.getId() == null || order.getId() == 0) {
            order = order;
        } else {
            order = orderRepository.findById(order.getId()).orElse(null);
            if(order == null) {
                return null;
            }
            if (order.getOrderDate() != null) {
                order.setOrderDate(order.getOrderDate());
            }
            if (order.getPhoneNumber() != null) {
                order.setPhoneNumber(order.getPhoneNumber());
            }
            if (order.getAddress() != null) {
                order.setAddress(order.getAddress());
            }
            if (order.getNote() != null) {
                order.setNote(order.getNote());
            }

            if (order.getStatus() != null) {
                order.setStatus(order.getStatus());
            }

            if(order.getCustomerId() != null) {
                order.setCustomerId(order.getCustomerId());
            }


        }
        System.out.println(order);
        return orderRepository.save(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found "+ id));
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
