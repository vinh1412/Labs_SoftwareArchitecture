/*
 * @ {#} Item.java   1.0     14/03/2025
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
public class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
