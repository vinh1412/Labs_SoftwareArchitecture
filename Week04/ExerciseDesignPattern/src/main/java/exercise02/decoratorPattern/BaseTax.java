/*
 * @ {#} BaseTax.java   1.0     14/03/2025
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
public class BaseTax implements Tax {
    @Override
    public double calculateTax(double price) {
        return 0;
    }
}
