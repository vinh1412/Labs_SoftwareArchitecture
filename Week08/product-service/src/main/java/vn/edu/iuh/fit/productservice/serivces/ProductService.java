/**
 * @ (#) ProductService.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.productservice.serivces;

import vn.edu.iuh.fit.productservice.entities.Product;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
public interface ProductService {
    public Product save(Product product);
    public Product findById(Long id);
    public List<Product> findAll();

    public void deleteProduct(Long id);
}
