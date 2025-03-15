/*
 * @ {#} Test.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */
      
package excercise03.strategyPattern;
/*
 * @description: 
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("1234", 10));
        shoppingCart.addItem(new Item("5678", 40));

        shoppingCart.pay(new PaypalStrategy("abc@gmail.com", "123456"));
        shoppingCart.pay(new CreditCardStrategy("Tran Hien Vinh", "1234567890123456", "786", "12/15"));
    }
}
