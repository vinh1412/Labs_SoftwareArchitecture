/*
 * @ {#} ComputerFactory.java   1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */
      
package abstractFactory;
/*
 * @description: 
 * @author: Tran Hien Vinh
 * @date:   12/03/2025
 * @version:    1.0
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
