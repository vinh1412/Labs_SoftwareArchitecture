/*
 * @ {#} Test.java   1.0     12/03/2025
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
public class Test {
    public static void main(String[] args) {
        TVContext context=new TVContext();
        State tvStartState=new TVStartState();
        State tvStopState=new TVStopState();
        context.setTvState(tvStartState);
        context.doAction();
        context.setTvState(tvStopState);
        context.doAction();
    }
}
