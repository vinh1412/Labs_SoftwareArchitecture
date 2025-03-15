/*
 * @ {#} Test.java   1.0     14/03/2025
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
public class Test {
    public static void main(String[] args) {
        TaxState specialTax = new SpecialTaxState();
        TaxState consumptionTax = new ConsumptionTaxState();
        TaxState taxState = new VATState();
        Product product = new Product("Product 1", 1000, taxState);
        product.printTax();
    }
}
