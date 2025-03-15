/*
 * @ {#} PaypalState.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package excercise03.statePattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class PaypalState implements PaymentState {
    @Override
    public void pay() {
        System.out.println("Paypal payment");
    }
}
