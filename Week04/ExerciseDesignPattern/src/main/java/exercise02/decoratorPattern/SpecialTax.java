/*
 * @ {#} SpecialTax.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.decoratorPattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class SpecialTax extends TaxDecorator {
    public SpecialTax(Tax tax) {
        super(tax);
    }

    @Override
    public double calculateTax(double price) {
        return super.calculateTax(price) + 0.2 * price;
    }
}
