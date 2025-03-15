/*
 * @ {#} TVStartState.java   1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package state;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   12/03/2025
 * @version:    1.0
 */
public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
