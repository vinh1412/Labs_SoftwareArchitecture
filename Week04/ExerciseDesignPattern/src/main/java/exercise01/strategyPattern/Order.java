/*
 * @ {#} Order.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.strategyPattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class Order {
    public void orderState(OrderStrategy orderStrategy) {
        String orderStatus = "";
        orderStrategy.handleOrder(orderStatus);
    }
}
