/*
 * @ {#} OrderItem.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    private String productId;
    private int quantity;
    private double price;
}
