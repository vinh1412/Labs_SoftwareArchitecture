/*
 * @ {#} Test.java   1.0     14/03/2025
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
public class Test {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        OrderState newOrder = new NewOrderState();
        OrderState processing = new ProcessingOrderState();
        OrderState delivered = new DeliveredOrderState();
        OrderState cancel = new CancelledOrderState();

        orderContext.setOrderState(delivered);

        orderContext.doAction();
        orderContext.printPreviousStates();
        orderContext.printNextStates();
    }
}
