/*
 * @ {#} PaymentContext.java   1.0     14/03/2025
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
public class PaymentContext {
    private PaymentState paymentState;

    public PaymentContext() {
        this.paymentState = new PaypalState();
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void pay() {
        paymentState.pay();
    }
}
