/*
 * @ {#} TaxDecorator.java   1.0     14/03/2025
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
public class TaxDecorator implements Tax {
    protected Tax tax;

    public TaxDecorator(Tax tax) {
        this.tax = tax;
    }

    @Override
    public double calculateTax(double price) {
        return tax.calculateTax(price);
    }
}
