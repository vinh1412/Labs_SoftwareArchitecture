/**
 * @ (#) OrderService.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.orderservice.serivces;

import vn.edu.iuh.fit.orderservice.entities.Order;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
public interface OrderService {
    public Order save(Order order);
    public Order findById(Long id);
    public List<Order> findAll();

    public void deleteOrder(Long id);
}
