/*
 * @ {#} Test.java   1.0     14/03/2025
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
public class Test {
    public static void main(String[] args) {
        Tax tax = new BaseTax();
        System.out.println(tax.calculateTax(100));

        Tax consumptionTax = new ConsumptionTax(new BaseTax());
        System.out.println(consumptionTax.calculateTax(100));

        Tax vat = new VAT(new ConsumptionTax(new BaseTax()));
        System.out.println(vat.calculateTax(100));

        Tax specialTax = new SpecialTax(new VAT(new ConsumptionTax(new BaseTax())));
        System.out.println(specialTax.calculateTax(100));
    }
}
