/*
 * @ {#} OrderContext.java   1.0     14/03/2025
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
public class OrderContext{

    private OrderState orderState;

    public OrderContext() {
        this.orderState = new NewOrderState(); // Mặc định là trạng thái mới tạo
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void doAction() {
        System.out.println("Trạng thái hiện tại: " + orderState.getClass().getSimpleName());
        this.orderState.doAction();
    }

    public void printPreviousStates() {
        if (orderState.getPreviousState() != null) {
            System.out.println("Trạng thái trước: " + orderState.getPreviousState().getClass().getSimpleName());
        } else {
            System.out.println("Không có trạng thái trước");
        }
    }

    public void printNextStates() {
        if (orderState == null || orderState.getNextState() == null){
            System.out.println("Không có trạng thái tiếp theo");
        } else {
            System.out.println("Trạng thái tiếp theo: " + orderState.getNextState().getClass().getSimpleName());
        }
    }
}
