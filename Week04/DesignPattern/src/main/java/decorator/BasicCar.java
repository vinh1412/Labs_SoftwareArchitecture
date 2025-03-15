/*
 * @ {#} BasicCar.java   1.0     13/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package decorator;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   13/03/2025
 * @version:    1.0
 */
public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
