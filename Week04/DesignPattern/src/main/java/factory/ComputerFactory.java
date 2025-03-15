/*
 * @ {#} ComputerFactory.java   1.0     12/03/2025
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
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
