/*
 * @ {#} Test.java   1.0     14/03/2025
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
public class Test {
    public static void main(String[] args) {
        System.out.println("Tạo đơn hàng mới:");
        Order newOrder = new NewOrder(new BasicOrder());
        newOrder.process();

        System.out.println("\nĐơn hàng mới được xử lý:");
        Order processingOrder = new ProcessingOrder(new NewOrder(new BasicOrder()));
        processingOrder.process();

        System.out.println("\nĐơn hàng đã được giao:");
        Order deliveredOrder = new DeliveredOrder(new ProcessingOrder(new NewOrder(new BasicOrder())));
        deliveredOrder.process();

        System.out.println("\nĐơn hàng đã bị hủy:");
        Order cancelledOrder = new CancelledOrder(new ProcessingOrder(new NewOrder(new BasicOrder())));
        cancelledOrder.process();
    }
}
