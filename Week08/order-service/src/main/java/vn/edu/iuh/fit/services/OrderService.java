/*
 * @ {#} OrderService.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.entities.Order;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
public interface OrderService {
    Order create(Order order);
    List<Order> getAll();
    Order getById(String id);
    Order update(String id, Order order);
    void delete(String id);
}
