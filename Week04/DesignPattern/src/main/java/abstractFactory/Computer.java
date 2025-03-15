/*
 * @ {#} Computer.java   1.0     12/03/2025
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
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
