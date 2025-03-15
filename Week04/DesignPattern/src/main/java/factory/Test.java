/*
 * @ {#} Test.java   1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package factory;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   12/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
