/*
 * @ {#} CustomerServiceImpl.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Customer;
import vn.edu.iuh.fit.repositories.CustomerRepository;
import vn.edu.iuh.fit.services.CustomerService;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer update(String id, Customer updated) {
        Customer existing = customerRepository.findById(id).orElse(null);
        if (existing == null) return null;
        updated.setId(id);
        return customerRepository.save(updated);
    }

    @Override
    public void delete(String id) {
        Customer existing = customerRepository.findById(id).orElse(null);
        if (existing != null) {
            customerRepository.delete(existing);
        }
    }
}
