/*
 * @ {#} Product.java   1.0     24/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Document(collection = "products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;
}
