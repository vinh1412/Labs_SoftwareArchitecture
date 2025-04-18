/**
 * @ (#) ProductServiceImpl.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.productservice.serivces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.entities.Product;
import vn.edu.iuh.fit.productservice.repositories.ProductRepository;
import vn.edu.iuh.fit.productservice.serivces.ProductService;

import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date: 4/12/2025
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private  ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        System.out.println("Product: " + product.getId() + " " + product.getName() + " " + product.getDescription() + " " + product.getPrice());
        if (product.getId() == null || product.getId() == 0) {
            product = product;
        } else {
            product = productRepository.findById(product.getId()).orElse(null);
            if(product == null) {
                return null;
            }
            if (product.getName() != null) {
                product.setName(product.getName());
            }
            if (product.getDescription() != null) {
                product.setDescription(product.getDescription());
            }
            if (product.getPrice() != 0) {
                product.setPrice(product.getPrice());
            }

        }
        System.out.println(product);
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found "+ id));
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
