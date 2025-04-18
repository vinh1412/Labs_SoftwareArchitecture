/**
 * @ (#) OrderRepository.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.orderservice.entities.Order;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
