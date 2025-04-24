/*
 * @ {#} ProductServiceImpl.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Product;
import vn.edu.iuh.fit.repositories.ProductRepository;
import vn.edu.iuh.fit.services.ProductService;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

     private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product update(String id, Product product) {
        Product existing = productRepository.findById(id).orElse(null);
        if (existing == null) return null;
        product.setId(existing.getId());
        return productRepository.save(product);
    }

    @Override
    public void delete(String id) {
        Product existing = productRepository.findById(id).orElse(null);
        if (existing != null) {
            productRepository.delete(existing);
        }
    }

    @Override
    public Product updateStock(String productId, int stock) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            throw new RuntimeException("Product not found");
        }
        int newStock = stock;
        product.setStock(newStock);
        return productRepository.save(product);
    }
}
