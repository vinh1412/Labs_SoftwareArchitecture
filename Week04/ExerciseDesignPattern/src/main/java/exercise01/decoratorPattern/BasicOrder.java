/*
 * @ {#} BasicOrder.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.decoratorPattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class BasicOrder implements Order {
    @Override
    public void process() {
        System.out.println("Đơn hàng được tạo.");
    }
}
