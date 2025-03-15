/*
 * @ {#} Delivered.java   1.0     14/03/2025
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
public class DeliveredOrderState implements OrderState {

    @Override
    public void doAction() {
        System.out.println("---Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
    }

    @Override
    public OrderState getPreviousState() {
        return new ProcessingOrderState(); // Trạng thái trước đó là đang xử lý
    }

    @Override
    public OrderState getNextState() {
        return this; // Đã giao là trạng thái cuối cùng
    }
}
