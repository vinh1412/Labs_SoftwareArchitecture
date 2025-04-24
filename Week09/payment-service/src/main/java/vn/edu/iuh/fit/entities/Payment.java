/*
 * @ {#} Payment.java   1.0     25/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.entities;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   25/04/2025
 * @version:    1.0
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import vn.edu.iuh.fit.enums.PaymentMethod;
import vn.edu.iuh.fit.enums.PaymentStatus;

import java.time.LocalDateTime;

@Document(collection = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    private String id;
    private String orderId;
    private String customerId;
    private double amount;
    private PaymentMethod paymentMethod; // e.g., "credit_card", "paypal"
    private PaymentStatus status; // e.g., "success", "pending", "failed"
    private LocalDateTime createdAt;
}
