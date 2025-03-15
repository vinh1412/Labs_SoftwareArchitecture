/*
 * @ {#} Processing.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise01.statePattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class ProcessingOrderState implements OrderState {
    @Override
    public void doAction() {
        System.out.println("---Đang xử lý: Đóng gói và vận chuyển.");
    }

    @Override
    public OrderState getPreviousState() {
        return new NewOrderState(); // Trạng thái trước đó là mới tạo
    }

    @Override
    public OrderState getNextState() {
        return new DeliveredOrderState(); // Chuyển sang trạng thái đã giao
    }
}
