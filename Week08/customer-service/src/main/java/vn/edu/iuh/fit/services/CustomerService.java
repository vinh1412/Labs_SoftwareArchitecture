/*
 * @ {#} CustomerService.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.entities.Customer;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
public interface CustomerService {
    Customer create(Customer customer);
    List<Customer> getAll();
    Customer getById(String id);
    Customer update(String id, Customer updated);
    void delete(String id);
}
