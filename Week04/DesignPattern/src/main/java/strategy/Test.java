/*
 * @ {#} Test.java   1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package strategy;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   12/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 20);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new CreditCardStrategy("Tran Hien Vinh", "1234567890123456", "786", "12/15"));
        cart.pay(new PaypalStrategy("abc@gmail.com", "123456"));
    }
}
