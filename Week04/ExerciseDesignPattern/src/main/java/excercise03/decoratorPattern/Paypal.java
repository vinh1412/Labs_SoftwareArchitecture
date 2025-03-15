/*
 * @ {#} Paypal.java   1.0     14/03/2025
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
public class Paypal extends PaymentDecorator {
    public Paypal(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
        System.out.println("Paypal payment");
    }
}
