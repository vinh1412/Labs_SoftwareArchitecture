/*
 * @ {#} SpecialTax.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.statePattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class SpecialTaxState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return price * 0.5;
    }
}
