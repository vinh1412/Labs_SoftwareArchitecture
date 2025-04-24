/*
 * @ {#} ProductRepository.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.entities.Product;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
