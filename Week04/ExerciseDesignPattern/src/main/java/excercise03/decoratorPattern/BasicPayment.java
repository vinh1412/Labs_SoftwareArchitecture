/*
 * @ {#} BasicPayment.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package excercise03.decoratorPattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class BasicPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using basic payment.");
    }
}
