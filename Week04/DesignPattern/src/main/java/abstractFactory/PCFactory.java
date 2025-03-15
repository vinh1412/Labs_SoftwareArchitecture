/*
 * @ {#} PC.java   1.0     12/03/2025
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
public class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
